package projeto.educacao.service.txr;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import projeto.educacao.exception.BussinesException;
import projeto.educacao.mapper.txr.TXRMapper;
import projeto.educacao.model.txr.DTO.TXRDTO;
import projeto.educacao.model.txr.TXR;
import projeto.educacao.repository.txr.TXRRepository;
import projeto.educacao.utils.MessageUtils;
import projeto.educacao.utils.XLSX;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Service
public class TXRService {
    @Autowired
    private TXRRepository repository;

    @Autowired
    private TXRMapper mapper;

    @Transactional
    public TXRDTO save(TXRDTO dto) {

        TXR txr = mapper.toEntity(dto);
        repository.save(txr);
        return mapper.toDto(txr);
    }

    @Transactional(readOnly = true)
    public List<TXRDTO> findAll() {
        List<TXR> list = repository.findAll();
        return mapper.toDto(list);
    }

    @Transactional
    public TXRDTO saveList(ArrayList<String> list, Long ano){
        TXR txr = mapper.ListtoEntity(list);
        txr.setAno(ano);

        Optional<TXR> optionalTXR = repository.findByAno(ano);

        if (optionalTXR.isPresent()){
            throw new BussinesException(MessageUtils.TXR_ALREADY_EXISTS);
        }

        repository.save(txr);
        return mapper.toDto(txr);
    }

    @Transactional
    public String saveXLSXbyPath(String path, Long ano) {

        Iterator<Row> rowIterator = XLSX.Connect(path);

        int j = 1;

        //varre todas as linhas da planilha 0
        while (rowIterator.hasNext()) {

            //recebe cada linha da planilha
            Row row = rowIterator.next();

            //pegamos todas as celulas desta linha
            Iterator<Cell> cellIterator = row.iterator();

            ArrayList<String> collum = new ArrayList<>(10);

            //exclui as linhas iniciais que não contem dados
            if (j <= 0) {

                //varremos todas as celulas da linha atual
                while (cellIterator.hasNext()) {

                    //criamos uma celula
                    Cell cell = cellIterator.next();

                    switch (cell.getCellType()) {

                        case Cell.CELL_TYPE_STRING:

                            //verifica se era um nulo numerico
                            if(cell.getStringCellValue().equals("--"))
                            {
                                collum.add("NaN");
                            }else{
                                collum.add(cell.getStringCellValue());
                            }
                            break;

                        case Cell.CELL_TYPE_NUMERIC:
                            collum.add(String.valueOf(cell.getNumericCellValue()));
                            break;
                    }
                }
            }
            else j--;

            //caso tenha todos os elementos da tabela, salva
            if(collum.size() == 61){
                saveList(collum , ano);
            }
        }

        return path;
    }

}
