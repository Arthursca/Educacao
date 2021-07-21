package projeto.educacao.mapper.TXR;

import org.springframework.stereotype.Component;
import projeto.educacao.model.TXR.DTO.TXRReprovadoDTO;
import projeto.educacao.model.TXR.TXR;
import projeto.educacao.model.TXR.TXRReprovado;
import java.util.List;
import java.util.stream.Collectors;


@Component
public class TXRReprovadoMapper {

    public TXRReprovado toEntity(TXRReprovadoDTO reprovadoDTO){
        TXRReprovado reprovado = new TXRReprovado();
        reprovado.setId(reprovadoDTO.getId());
        reprovado.setTxrEnsinoMedio(reprovadoDTO.getTxrEnsinoMedio());
        reprovado.setTxrEnsinoFundamental(reprovadoDTO.getTxrEnsinoFundamental());
        reprovado.setTxr(reprovadoDTO.getTxr());
        return reprovado;
    }

    public TXRReprovadoDTO toDto(TXRReprovado reprovado){
        TXRReprovadoDTO reprovadoDTO = new TXRReprovadoDTO();
        reprovadoDTO.setId(reprovado.getId());
        reprovadoDTO.setTxrEnsinoMedio(reprovado.getTxrEnsinoMedio());
        reprovadoDTO.setTxrEnsinoFundamental(reprovado.getTxrEnsinoFundamental());
        reprovadoDTO.setTxr(reprovado.getTxr());
        return reprovadoDTO;
    }

    public List<TXRReprovadoDTO> toDto(List<TXRReprovado>list){
        return list.stream().map(this::toDto).collect(Collectors.toList());
    }

    public TXRReprovado REListtoEntity(List<String> list, TXR txr) {
        TXREnsinoFundamentalMapper EFMapper = new TXREnsinoFundamentalMapper();
        TXREnsinoMedioMapper EMMapper = new TXREnsinoMedioMapper();
        TXRReprovado re = new TXRReprovado();
        re.setTxr(txr);
        re.setTxrEnsinoFundamental(EFMapper.EFListtoEntity(list.subList(0,12), re));
        re.setTxrEnsinoMedio(EMMapper.EMListtoEntity(list.subList(12,18) ,re));

        return re;
    }
}
