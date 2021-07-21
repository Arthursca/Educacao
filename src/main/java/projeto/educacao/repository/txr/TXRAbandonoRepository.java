package projeto.educacao.repository.txr;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projeto.educacao.model.txr.TXRAbandono;

@Repository
public interface TXRAbandonoRepository extends JpaRepository<TXRAbandono, Long> {
}
