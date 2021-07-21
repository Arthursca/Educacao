package projeto.educacao.model.txr;


import javax.persistence.*;

@Entity
@Table(name = "tb_txr_reprovacao")
public class TXRReprovado{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "txrReprovado")
    private TXR txr;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_fundamental")
    private TXREnsinoFundamental txrEnsinoFundamental;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_medio")
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

    @Override
    public String toString() {
        return "TXRReprovado{" +
                "id=" + id +
                ", txr=" + txr +
                ", txrEnsinoFundamental=" + txrEnsinoFundamental +
                ", txrEnsinoMedio=" + txrEnsinoMedio +
                '}';
    }
}
