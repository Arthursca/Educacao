package projeto.educacao.model.TXR.DTO;

import projeto.educacao.model.TXR.TXRAbandono;
import projeto.educacao.model.TXR.TXRAprovado;
import projeto.educacao.model.TXR.TXRReprovado;


public class TXRDTO {

    private Long id;

    private Long ano;

    private String regiao;

    private String UF;

    private Long codMunicipio;

    private String nomeMunicipio;

    private String localizacao;

    private String dependenciaAdm;

    private TXRAprovado txrAprovado;

    private TXRReprovado txrReprovado;

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
