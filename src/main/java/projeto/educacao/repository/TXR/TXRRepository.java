package projeto.educacao.repository.TXR;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projeto.educacao.model.TXR.TXR;

import java.util.Optional;

@Repository
public interface TXRRepository extends JpaRepository<TXR , Long> {

    Optional<TXR> findByAno(Long ano);
}
