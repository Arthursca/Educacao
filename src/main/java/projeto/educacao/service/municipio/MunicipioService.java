package projeto.educacao.service.municipio;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import projeto.educacao.exception.NotFoundException;
import projeto.educacao.mapper.municipio.MunicipioMapper;
import projeto.educacao.model.municipio.DTO.MunicipioDTO;
import projeto.educacao.model.municipio.Municipio;
import projeto.educacao.repository.municipio.MunicipioRepository;
import projeto.educacao.utils.XLSX;

import java.util.ArrayList;
import java.util.Iterator;

@Service
public class MunicipioService {

    @Autowired
    private MunicipioMapper mapper;

    @Autowired
    private MunicipioRepository repository;

    @Transactional
    public MunicipioDTO save(MunicipioDTO dto) {

        Municipio municipio = mapper.toEntity(dto);
        repository.save(municipio);
        return mapper.toDTO(municipio);
    }

    @Transactional(readOnly = true)
    public MunicipioDTO findByNomeMunicipioAndLocalizacaoAndDependenciaAdm(String nome, String localizacao, String dependencia){
        return repository.findByNomeMunicipioAndLocalizacaoAndDependenciaAdm(nome,localizacao,dependencia)
                .map(mapper::toDTO).orElseThrow(NotFoundException:: new);
    }

    @Transactional
    public MunicipioDTO saveList(ArrayList<String> list){
        Municipio municipio = mapper.ListtoEntity(list);
        repository.save(municipio);
        return mapper.toDTO(municipio);
    }


    @Transactional
    public String saveXLSXbyPath(String path) {

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
                saveList(collum);
            }
        }
        return path;
    }
}
