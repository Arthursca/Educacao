package projeto.educacao.model.municipio;


import javax.persistence.*;


@Entity
@Table(name = "tb_municipio")
public class Municipio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

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
