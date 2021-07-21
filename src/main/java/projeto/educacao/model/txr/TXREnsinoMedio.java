package projeto.educacao.model.txr;

import javax.persistence.*;

@Entity
@Table(name = "tb_txr_ensino_medio")
public class TXREnsinoMedio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "total")
    private Double total;

    @Column(name = "serie_1")
    private Double serie1;

    @Column(name = "serie_2")
    private Double serie2;

    @Column(name = "serie_3")
    private Double serie3;

    @Column(name = "serie_4")
    private Double serie4;

    @Column(name = "nao_seriado")
    private Double naoSeriado;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL ,mappedBy = "txrEnsinoMedio")
    private TXRAprovado txrAprovado;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL ,mappedBy = "txrEnsinoMedio")
    private TXRAbandono txrAbandono;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL ,mappedBy = "txrEnsinoMedio")
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

    @Override
    public String toString() {
        return "TXREnsinoMedio{" +
                "id=" + id +
                ", total=" + total +
                ", serie1=" + serie1 +
                ", serie2=" + serie2 +
                ", serie3=" + serie3 +
                ", serie4=" + serie4 +
                ", naoSeriado=" + naoSeriado +
                ", txrAprovado=" + txrAprovado +
                ", txrAbandono=" + txrAbandono +
                ", txrReprovado=" + txrReprovado +
                '}';
    }
}
