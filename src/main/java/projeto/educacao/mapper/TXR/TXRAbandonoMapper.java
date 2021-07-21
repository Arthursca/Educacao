package projeto.educacao.mapper.TXR;

import org.springframework.stereotype.Component;
import projeto.educacao.model.TXR.DTO.TXRAbandonoDTO;
import projeto.educacao.model.TXR.TXR;
import projeto.educacao.model.TXR.TXRAbandono;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class TXRAbandonoMapper {
    public TXRAbandono toEntity(TXRAbandonoDTO abandonoDTO){
        TXRAbandono abandono = new TXRAbandono();
        abandono.setId(abandonoDTO.getId());
        abandono.setTxrEnsinoMedio(abandonoDTO.getTxrEnsinoMedio());
        abandono.setTxrEnsinoFundamental(abandonoDTO.getTxrEnsinoFundamental());
        abandono.setTxr(abandonoDTO.getTxr());
        return abandono;
    }

    public TXRAbandonoDTO toDto(TXRAbandono abandono){
        TXRAbandonoDTO abandonoDTO = new TXRAbandonoDTO();
        abandonoDTO.setId(abandono.getId());
        abandonoDTO.setTxrEnsinoMedio(abandono.getTxrEnsinoMedio());
        abandonoDTO.setTxrEnsinoFundamental(abandono.getTxrEnsinoFundamental());
        abandonoDTO.setTxr(abandono.getTxr());
        return abandonoDTO;
    }

    public List<TXRAbandonoDTO> toDto(List<TXRAbandono>list){
        return list.stream().map(this::toDto).collect(Collectors.toList());
    }

    public TXRAbandono ABListtoEntity(List<String> list, TXR txr) {
        TXREnsinoFundamentalMapper EFMapper = new TXREnsinoFundamentalMapper();
        TXREnsinoMedioMapper EMMapper = new TXREnsinoMedioMapper();
        TXRAbandono ab = new TXRAbandono();
        ab.setTxr(txr);
        ab.setTxrEnsinoFundamental(EFMapper.EFListtoEntity(list.subList(0,12), ab));
        ab.setTxrEnsinoMedio(EMMapper.EMListtoEntity(list.subList(12,18) , ab));
        return ab;
    }


}
