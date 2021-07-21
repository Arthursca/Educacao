package projeto.educacao.model.TXR.DTO;

import projeto.educacao.model.TXR.TXRAbandono;
import projeto.educacao.model.TXR.TXRAprovado;
import projeto.educacao.model.TXR.TXRReprovado;

public class TXREnsinoMedioDTO {

    private Long id;

    private Double total;

    private Double serie1;

    private Double serie2;

    private Double serie3;

    private Double serie4;

    private Double naoSeriado;

    private TXRAprovado txrAprovado;

    private TXRAbandono txrAbandono;

    private TXRReprovado txrReprovado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }


    public Double getSerie1() {
        return serie1;
    }

    public void setSerie1(Double serie1) {
        this.serie1 = serie1;
    }

    public Double getSerie2() {
        return serie2;
    }

    public void setSerie2(Double serie2) {
        this.serie2 = serie2;
    }

    public Double getSerie3() {
        return serie3;
    }

    public void setSerie3(Double serie3) {
        this.serie3 = serie3;
    }

    public Double getSerie4() {
        return serie4;
    }

    public void setSerie4(Double serie4) {
        this.serie4 = serie4;
    }

    public Double getNaoSeriado() {
        return naoSeriado;
    }

    public void setNaoSeriado(Double naoSeriado) {
        this.naoSeriado = naoSeriado;
    }

    public TXRAprovado getTxrAprovado() {
        return txrAprovado;
    }

    public void setTxrAprovado(TXRAprovado txrAprovado) {
        this.txrAprovado = txrAprovado;
    }

    public TXRAbandono getTxrAbandono() {
        return txrAbandono;
    }

    public void setTxrAbandono(TXRAbandono txrAbandono) {
        this.txrAbandono = txrAbandono;
    }

    public TXRReprovado getTxrReprovado() {
        return txrReprovado;
    }

    public void setTxrReprovado(TXRReprovado txrReprovado) {
        this.txrReprovado = txrReprovado;
    }

}
