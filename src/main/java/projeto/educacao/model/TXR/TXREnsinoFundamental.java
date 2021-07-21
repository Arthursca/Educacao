package projeto.educacao.model.TXR;

import javax.persistence.*;

@Entity
@Table(name = "tb_txr_ensino_fundamental")
public class TXREnsinoFundamental {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "total")
    private Double total;

    @Column(name = "anos_finais")
    private Double anosFinais;

    @Column(name = "anos_iniciais")
    private Double anosIniciais;

    @Column(name = "ano_1")
    private Double ano1;

    @Column(name = "ano_2")
    private Double ano2;

    @Column(name = "ano_3")
    private Double ano3;

    @Column(name = "ano_4")
    private Double ano4;

    @Column(name = "ano_5")
    private Double ano5;

    @Column(name = "ano_6")
    private Double ano6;

    @Column(name = "ano_7")
    private Double ano7;

    @Column(name = "ano_8")
    private Double ano8;

    @Column(name = "ano_9")
    private Double ano9;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "txrEnsinoFundamental")
    private TXRAprovado txrAprovado;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "txrEnsinoFundamental")
    private TXRReprovado txrReprovado;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "txrEnsinoFundamental")
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
