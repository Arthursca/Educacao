package projeto.educacao.mapper.txr;

import org.springframework.stereotype.Component;
import projeto.educacao.model.txr.DTO.TXRDTO;
import projeto.educacao.model.txr.TXR;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class TXRMapper {

    public TXR toEntity(TXRDTO dto){
        TXR txr = new TXR();
        txr.setId(dto.getId());
        txr.setAno(dto.getAno());
        txr.setRegiao(dto.getRegiao());
        txr.setUF(dto.getUF());
        txr.setCodMunicipio(dto.getCodMunicipio());
        txr.setNomeMunicipio(dto.getNomeMunicipio());
        txr.setLocalizacao(dto.getLocalizacao());
        txr.setDependenciaAdm(dto.getDependenciaAdm());
        txr.setTxrAprovado(dto.getTxrAprovado());
        txr.setTxrReprovado(dto.getTxrReprovado());
        txr.setTxrAbandono(dto.getTxrAbandono());
        return txr;
    }

    public TXRDTO toDto(TXR txr){
        TXRDTO dto = new TXRDTO();
        dto.setId(txr.getId());
        dto.setAno(txr.getAno());
        dto.setRegiao(txr.getRegiao());
        dto.setUF(txr.getUF());
        dto.setCodMunicipio(txr.getCodMunicipio());
        dto.setNomeMunicipio(txr.getNomeMunicipio());
        dto.setLocalizacao(txr.getLocalizacao());
        dto.setDependenciaAdm(txr.getDependenciaAdm());
        dto.setTxrAprovado(txr.getTxrAprovado());
        dto.setTxrReprovado(txr.getTxrReprovado());
        dto.setTxrAbandono(txr.getTxrAbandono());
        return dto;
    }

    public List<TXRDTO> toDto(List<TXR>list){
        return list.stream().map(this::toDto).collect(Collectors.toList());
    }

    public TXR ListtoEntity(ArrayList<String> list) {
        TXRReprovadoMapper REMapper = new TXRReprovadoMapper();
        TXRAprovadoMapper APMapper = new TXRAprovadoMapper();
        TXRAbandonoMapper ABMapper = new TXRAbandonoMapper();
        TXR txr = new TXR();
        txr.setAno(Long.parseLong(String.valueOf((long)(Double.parseDouble(list.get(0))))));
        txr.setRegiao(list.get(1));
        txr.setUF(list.get(2));
        txr.setCodMunicipio(Long.parseLong(String.valueOf((long)(Double.parseDouble(list.get(3))))));
        txr.setNomeMunicipio(list.get(4));
        txr.setLocalizacao(list.get(5));
        txr.setDependenciaAdm(list.get(6));
        txr.setTxrAprovado(APMapper.APListtoEntity(list.subList(7,25),txr));
        txr.setTxrAbandono(ABMapper.ABListtoEntity(list.subList(25,43),txr));
        txr.setTxrReprovado(REMapper.REListtoEntity(list.subList(43,61),txr));
        return txr;
    }
}
