package projeto.educacao.repository.municipio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import projeto.educacao.model.municipio.Municipio;

import java.util.Optional;


@Repository
public interface MunicipioRepository  extends JpaRepository <Municipio , Long> {

    @Query("SELECT municipio " +
            "FROM Municipio municipio " +
            "WHERE municipio.nomeMunicipio= :nome " +
            "And municipio.localizacao = :localizacao " +
            "And municipio.dependenciaAdm = :dependencia")
    Optional<Municipio> findByNomeMunicipioAndLocalizacaoAndDependenciaAdm(String nome, String localizacao, String dependencia);
}

