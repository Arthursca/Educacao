package projeto.educacao.model.municipio;

import projeto.educacao.model.avaliacao.Avaliacao;

import java.util.List;

public class Municipio {

    private Long id;

    private String regiao;

    private String UF;

    private Long codMunicipio;

    private String nomeMunicipio;

    private String localizacao;

    private String dependenciaAdm;

    private List<Avaliacao> avaliacao;
}
