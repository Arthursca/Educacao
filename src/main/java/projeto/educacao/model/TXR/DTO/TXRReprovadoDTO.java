package projeto.educacao.model.TXR.DTO;

import projeto.educacao.model.TXR.TXR;
import projeto.educacao.model.TXR.TXREnsinoFundamental;
import projeto.educacao.model.TXR.TXREnsinoMedio;


public class TXRReprovadoDTO{

    private Long id;

    private TXR txr;

    private TXREnsinoFundamental txrEnsinoFundamental;

    private TXREnsinoMedio txrEnsinoMedio;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TXREnsinoFundamental getTxrEnsinoFundamental() {
        return txrEnsinoFundamental;
    }

    public void setTxrEnsinoFundamental(TXREnsinoFundamental txrEnsinoFundamental) {
        this.txrEnsinoFundamental = txrEnsinoFundamental;
    }

    public TXREnsinoMedio getTxrEnsinoMedio() {
        return txrEnsinoMedio;
    }

    public void setTxrEnsinoMedio(TXREnsinoMedio txrEnsinoMedio) {
        this.txrEnsinoMedio = txrEnsinoMedio;
    }

    public TXR getTxr() {
        return txr;
    }

    public void setTxr(TXR txr) {
        this.txr = txr;
    }
}
