package projeto.educacao.mapper.txr;

import org.springframework.stereotype.Component;
import projeto.educacao.model.txr.DTO.TXRAprovadoDTO;
import projeto.educacao.model.txr.TXR;
import projeto.educacao.model.txr.TXRAprovado;


import java.util.List;
import java.util.stream.Collectors;


@Component
public class TXRAprovadoMapper{



    public TXRAprovado toEntity(TXRAprovadoDTO aprovadoDTO) {
        TXRAprovado aprovado = new TXRAprovado();
        aprovado.setId(aprovadoDTO.getId());
        aprovado.setTxrEnsinoMedio(aprovadoDTO.getTxrEnsinoMedio());
        aprovado.setTxrEnsinoFundamental(aprovadoDTO.getTxrEnsinoFundamental());
        aprovado.setTxr(aprovadoDTO.getTxr());
        return aprovado;
    }


    public TXRAprovadoDTO toDto(TXRAprovado aprovado) {
        TXRAprovadoDTO aprovadoDTO = new TXRAprovadoDTO();
        aprovadoDTO.setId(aprovado.getId());
        aprovadoDTO.setTxrEnsinoMedio(aprovado.getTxrEnsinoMedio());
        aprovadoDTO.setTxrEnsinoFundamental(aprovado.getTxrEnsinoFundamental());
        aprovadoDTO.setTxr(aprovado.getTxr());
        return aprovadoDTO;
    }


    public List<TXRAprovadoDTO> toDto(List<TXRAprovado> list) {
        return list.stream().map(this::toDto).collect(Collectors.toList());
    }

    public TXRAprovado APListtoEntity(List<String> list, TXR txr) {
        TXREnsinoFundamentalMapper EFMapper = new TXREnsinoFundamentalMapper();
        TXREnsinoMedioMapper EMMapper = new TXREnsinoMedioMapper();
        TXRAprovado ap = new TXRAprovado();
        ap.setTxr(txr);
        ap.setTxrEnsinoFundamental(EFMapper.EFListtoEntity(list.subList(0,12), ap));
        ap.setTxrEnsinoMedio(EMMapper.EMListtoEntity(list.subList(12,18) ,ap));
        return ap;
    }

}
