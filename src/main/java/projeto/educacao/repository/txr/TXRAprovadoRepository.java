package projeto.educacao.repository.txr;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projeto.educacao.model.txr.TXRAprovado;

@Repository
public interface TXRAprovadoRepository extends JpaRepository<TXRAprovado, Long> {
}
