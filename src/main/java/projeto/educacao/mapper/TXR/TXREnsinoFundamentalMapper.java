package projeto.educacao.mapper.TXR;

import org.springframework.stereotype.Component;
import projeto.educacao.model.TXR.DTO.TXREnsinoFundamentalDTO;
import projeto.educacao.model.TXR.TXRAbandono;
import projeto.educacao.model.TXR.TXRAprovado;
import projeto.educacao.model.TXR.TXREnsinoFundamental;
import projeto.educacao.model.TXR.TXRReprovado;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class TXREnsinoFundamentalMapper{

    public TXREnsinoFundamental toEntity(TXREnsinoFundamentalDTO ensinoFundamentalDTO){
        TXREnsinoFundamental ensinoFundamental = new TXREnsinoFundamental();
        ensinoFundamental.setId(ensinoFundamentalDTO.getId());
        ensinoFundamental.setTotal(ensinoFundamentalDTO.getTotal());
        ensinoFundamental.setAnosFinais(ensinoFundamentalDTO.getAnosFinais());
        ensinoFundamental.setAnosIniciais(ensinoFundamentalDTO.getAnosIniciais());
        ensinoFundamental.setAno1(ensinoFundamentalDTO.getAno1());
        ensinoFundamental.setAno2(ensinoFundamentalDTO.getAno2());
        ensinoFundamental.setAno3(ensinoFundamentalDTO.getAno3());
        ensinoFundamental.setAno4(ensinoFundamentalDTO.getAno4());
        ensinoFundamental.setAno5(ensinoFundamentalDTO.getAno5());
        ensinoFundamental.setAno6(ensinoFundamentalDTO.getAno6());
        ensinoFundamental.setAno7(ensinoFundamentalDTO.getAno7());
        ensinoFundamental.setAno8(ensinoFundamentalDTO.getAno8());
        ensinoFundamental.setAno9(ensinoFundamentalDTO.getAno9());
        ensinoFundamental.setTxrAprovado(ensinoFundamentalDTO.getTxrAprovado());
        ensinoFundamental.setTxrAbandono(ensinoFundamentalDTO.getTxrAbandono());
        ensinoFundamental.setTxrReprovado(ensinoFundamentalDTO.getTxrReprovado());
        return ensinoFundamental;
    }

    public TXREnsinoFundamentalDTO toDto(TXREnsinoFundamental ensinoFundamental){
        TXREnsinoFundamentalDTO ensinoFundamentalDTO = new TXREnsinoFundamentalDTO();
        ensinoFundamentalDTO.setId(ensinoFundamental.getId());
        ensinoFundamentalDTO.setTotal(ensinoFundamental.getTotal());
        ensinoFundamentalDTO.setAnosFinais(ensinoFundamental.getAnosFinais());
        ensinoFundamentalDTO.setAnosIniciais(ensinoFundamental.getAnosIniciais());
        ensinoFundamentalDTO.setAno1(ensinoFundamental.getAno1());
        ensinoFundamentalDTO.setAno2(ensinoFundamental.getAno2());
        ensinoFundamentalDTO.setAno3(ensinoFundamental.getAno3());
        ensinoFundamentalDTO.setAno4(ensinoFundamental.getAno4());
        ensinoFundamentalDTO.setAno5(ensinoFundamental.getAno5());
        ensinoFundamentalDTO.setAno6(ensinoFundamental.getAno6());
        ensinoFundamentalDTO.setAno7(ensinoFundamental.getAno7());
        ensinoFundamentalDTO.setAno8(ensinoFundamental.getAno8());
        ensinoFundamentalDTO.setAno9(ensinoFundamental.getAno9());
        ensinoFundamentalDTO.setTxrAprovado(ensinoFundamental.getTxrAprovado());
        ensinoFundamentalDTO.setTxrAbandono(ensinoFundamental.getTxrAbandono());
        ensinoFundamentalDTO.setTxrReprovado(ensinoFundamental.getTxrReprovado());
        return ensinoFundamentalDTO;
    }

    public List<TXREnsinoFundamentalDTO> toDto(List<TXREnsinoFundamental>list){
        return list.stream().map(this::toDto).collect(Collectors.toList());
    }

    public TXREnsinoFundamental EFListtoEntity(List<String> list, TXRAprovado ap){
        return  EFListtoEntity(list, ap, null, null);}

    public TXREnsinoFundamental EFListtoEntity(List<String> list, TXRReprovado re){
        return  EFListtoEntity(list, null, re, null);}

    public TXREnsinoFundamental EFListtoEntity(List<String> list, TXRAbandono ab){
        return  EFListtoEntity(list, null, null, ab);}

    private TXREnsinoFundamental EFListtoEntity(List<String> list, TXRAprovado ap, TXRReprovado re, TXRAbandono ab){
        TXREnsinoFundamental ensinoFundamental = new TXREnsinoFundamental();
        ensinoFundamental.setTotal(Double.parseDouble(list.get(0)));
        ensinoFundamental.setAnosFinais(Double.parseDouble(list.get(1)));
        ensinoFundamental.setAnosIniciais(Double.parseDouble(list.get(2)));
        ensinoFundamental.setAno1(Double.parseDouble(list.get(3)));
        ensinoFundamental.setAno2(Double.parseDouble(list.get(4)));
        ensinoFundamental.setAno3(Double.parseDouble(list.get(5)));
        ensinoFundamental.setAno4(Double.parseDouble(list.get(6)));
        ensinoFundamental.setAno5(Double.parseDouble(list.get(7)));
        ensinoFundamental.setAno6(Double.parseDouble(list.get(8)));
        ensinoFundamental.setAno7(Double.parseDouble(list.get(9)));
        ensinoFundamental.setAno8(Double.parseDouble(list.get(10)));
        ensinoFundamental.setAno9(Double.parseDouble(list.get(11)));
        if(ap != null) ensinoFundamental.setTxrAprovado(ap);
        else if(ab != null) ensinoFundamental.setTxrAbandono(ab);
        else if(re != null) ensinoFundamental.setTxrReprovado(re);
        return ensinoFundamental;
    }
}
