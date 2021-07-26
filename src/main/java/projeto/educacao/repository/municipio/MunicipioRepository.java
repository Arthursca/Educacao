package projeto.educacao.repository.municipio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projeto.educacao.model.municipio.Municipio;


@Repository
public interface MunicipioRepository  extends JpaRepository <Municipio , Long> {
}

