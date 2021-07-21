package projeto.educacao.repository.TXR;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projeto.educacao.model.TXR.TXRAprovado;

@Repository
public interface TXRAprovadoRepository extends JpaRepository<TXRAprovado, Long> {
}
