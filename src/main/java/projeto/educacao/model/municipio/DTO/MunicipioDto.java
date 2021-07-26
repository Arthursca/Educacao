package projeto.educacao.model.municipio.DTO;

import javax.persistence.Column;

public class MunicipioDTO {

    private Long id;

    private String regiao;

    private String UF;

    private Long codMunicipio;

    private String nomeMunicipio;

    private String localizacao;

    private String dependenciaAdm;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
