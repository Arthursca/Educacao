package projeto.educacao.model.txr;

import javax.persistence.*;

@Entity
@Table(name = "tb_txr")
public class TXR {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "ano")
    private Long ano;

    @Column(name = "regiao")
    private String regiao;

    @Column(name = "uf")
    private String UF;

    @Column(name = "cod_municipio")
    private Long codMunicipio;

    @Column(name = "nome_municipio")
    private String nomeMunicipio;

    @Column(name = "localizacao")
    private String localizacao;


    @Column(name = "dependencia_adm")
    private String dependenciaAdm;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_aprovacao")
    private TXRAprovado txrAprovado;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_reprovacao")
    private TXRReprovado txrReprovado;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_abandono")
    private TXRAbandono txrAbandono;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAno() {
        return ano;
    }

    public void setAno(Long ano) {
        this.ano = ano;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public Long getCodMunicipio() {
        return codMunicipio;
    }

    public void setCodMunicipio(Long codMunicipio) {
        this.codMunicipio = codMunicipio;
    }

    public String getNomeMunicipio() {
        return nomeMunicipio;
    }

    public void setNomeMunicipio(String nomeMunicipio) {
        this.nomeMunicipio = nomeMunicipio;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getDependenciaAdm() {
        return dependenciaAdm;
    }

    public void setDependenciaAdm(String dependenciaAdm) {
        this.dependenciaAdm = dependenciaAdm;
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
