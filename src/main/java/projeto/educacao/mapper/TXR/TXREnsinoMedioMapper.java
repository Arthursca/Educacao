package projeto.educacao.mapper.TXR;

import org.springframework.stereotype.Component;
import projeto.educacao.model.TXR.DTO.TXREnsinoMedioDTO;
import projeto.educacao.model.TXR.TXRAbandono;
import projeto.educacao.model.TXR.TXRAprovado;
import projeto.educacao.model.TXR.TXREnsinoMedio;
import projeto.educacao.model.TXR.TXRReprovado;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class TXREnsinoMedioMapper {

    public TXREnsinoMedio toEntity(TXREnsinoMedioDTO ensinoMedioDTO){
        TXREnsinoMedio ensinoMedio = new TXREnsinoMedio();
        ensinoMedio.setId(ensinoMedioDTO.getId());
        ensinoMedio.setTotal(ensinoMedioDTO.getTotal());
        ensinoMedio.setSerie1(ensinoMedioDTO.getSerie1());
        ensinoMedio.setSerie2(ensinoMedioDTO.getSerie2());
        ensinoMedio.setSerie3(ensinoMedioDTO.getSerie3());
        ensinoMedio.setSerie4(ensinoMedioDTO.getSerie4());
        ensinoMedio.setNaoSeriado(ensinoMedioDTO.getNaoSeriado());
        ensinoMedio.setTxrAprovado(ensinoMedioDTO.getTxrAprovado());
        ensinoMedio.setTxrAbandono(ensinoMedioDTO.getTxrAbandono());
        ensinoMedio.setTxrReprovado(ensinoMedioDTO.getTxrReprovado());
        return ensinoMedio;
    }

    public TXREnsinoMedioDTO toDto(TXREnsinoMedio ensinoMedio){
        TXREnsinoMedioDTO ensinoMedioDTO = new TXREnsinoMedioDTO();
        ensinoMedioDTO.setId(ensinoMedio.getId());
        ensinoMedioDTO.setTotal(ensinoMedio.getTotal());
        ensinoMedioDTO.setSerie1(ensinoMedio.getSerie1());
        ensinoMedioDTO.setSerie2(ensinoMedio.getSerie2());
        ensinoMedioDTO.setSerie3(ensinoMedio.getSerie3());
        ensinoMedioDTO.setSerie4(ensinoMedio.getSerie4());
        ensinoMedioDTO.setNaoSeriado(ensinoMedio.getNaoSeriado());
        ensinoMedioDTO.setTxrAprovado(ensinoMedio.getTxrAprovado());
        ensinoMedioDTO.setTxrAbandono(ensinoMedio.getTxrAbandono());
        ensinoMedioDTO.setTxrReprovado(ensinoMedio.getTxrReprovado());
        return ensinoMedioDTO;
    }
    public List<TXREnsinoMedioDTO> toDto(List<TXREnsinoMedio>list){
        return list.stream().map(this::toDto).collect(Collectors.toList());
    }

    public TXREnsinoMedio EMListtoEntity(List<String> list, TXRAprovado ap){
        return  EMListtoEntity(list, ap,null,null);}

    public TXREnsinoMedio EMListtoEntity(List<String> list, TXRReprovado re){
        return  EMListtoEntity(list, null,re,null);}

    public TXREnsinoMedio EMListtoEntity(List<String> list, TXRAbandono ab){
        return  EMListtoEntity(list, null,null,ab);}

    private TXREnsinoMedio EMListtoEntity(List<String> list, TXRAprovado ap, TXRReprovado re, TXRAbandono ab){
        TXREnsinoMedio ensinoMedio = new TXREnsinoMedio();
        ensinoMedio.setTotal(Double.parseDouble(list.get(0)));
        ensinoMedio.setSerie1(Double.parseDouble(list.get(1)));
        ensinoMedio.setSerie2(Double.parseDouble(list.get(2)));
        ensinoMedio.setSerie3(Double.parseDouble(list.get(3)));
        ensinoMedio.setSerie4(Double.parseDouble(list.get(4)));
        ensinoMedio.setNaoSeriado(Double.parseDouble(list.get(5)));
        if(ap != null) ensinoMedio.setTxrAprovado(ap);
        else if(ab != null) ensinoMedio.setTxrAbandono(ab);
        else if(re != null) ensinoMedio.setTxrReprovado(re);
        return ensinoMedio;
    }
}
