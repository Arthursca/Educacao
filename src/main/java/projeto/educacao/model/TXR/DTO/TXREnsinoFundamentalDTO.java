package projeto.educacao.model.TXR.DTO;

import projeto.educacao.model.TXR.TXRAbandono;
import projeto.educacao.model.TXR.TXRAprovado;
import projeto.educacao.model.TXR.TXRReprovado;

public class TXREnsinoFundamentalDTO {

    private Long id;

    private Double total;

    private Double anosFinais;

    private Double anosIniciais;

    private Double ano1;

    private Double ano2;

    private Double ano3;

    private Double ano4;

    private Double ano5;

    private Double ano6;

    private Double ano7;

    private Double ano8;

    private Double ano9;

    private TXRAprovado txrAprovado;

    private TXRReprovado txrReprovado;

    private TXRAbandono txrAbandono;

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

    public Double getAnosFinais() {
        return anosFinais;
    }

    public void setAnosFinais(Double anosFinais) {
        this.anosFinais = anosFinais;
    }

    public Double getAnosIniciais() {
        return anosIniciais;
    }

    public void setAnosIniciais(Double anosIniciais) {
        this.anosIniciais = anosIniciais;
    }

    public Double getAno1() {
        return ano1;
    }

    public void setAno1(Double ano1) {
        this.ano1 = ano1;
    }

    public Double getAno2() {
        return ano2;
    }

    public void setAno2(Double ano2) {
        this.ano2 = ano2;
    }

    public Double getAno3() {
        return ano3;
    }

    public void setAno3(Double ano3) {
        this.ano3 = ano3;
    }

    public Double getAno4() {
        return ano4;
    }

    public void setAno4(Double ano4) {
        this.ano4 = ano4;
    }

    public Double getAno5() {
        return ano5;
    }

    public void setAno5(Double ano5) {
        this.ano5 = ano5;
    }

    public Double getAno6() {
        return ano6;
    }

    public void setAno6(Double ano6) {
        this.ano6 = ano6;
    }

    public Double getAno7() {
        return ano7;
    }

    public void setAno7(Double ano7) {
        this.ano7 = ano7;
    }

    public Double getAno8() {
        return ano8;
    }

    public void setAno8(Double ano8) {
        this.ano8 = ano8;
    }

    public Double getAno9() {
        return ano9;
    }

    public void setAno9(Double ano9) {
        this.ano9 = ano9;
    }

    public TXRAprovado getTxrAprovado() {
        return txrAprovado;
    }

    public void setTxrAprovado(TXRAprovado txrAprovado) {
        this.txrAprovado = txrAprovado;
    }

    public TXRReprovado getTxrReprovado() {
        return txrReprovado;
    }

    public void setTxrReprovado(TXRReprovado txrReprovado) {
        this.txrReprovado = txrReprovado;
    }

    public TXRAbandono getTxrAbandono() {
        return txrAbandono;
    }

    public void setTxrAbandono(TXRAbandono txrAbandono) {
        this.txrAbandono = txrAbandono;
    }
}
