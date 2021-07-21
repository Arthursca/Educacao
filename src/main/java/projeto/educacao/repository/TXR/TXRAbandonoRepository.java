package projeto.educacao.repository.TXR;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projeto.educacao.model.TXR.TXRAbandono;

@Repository
public interface TXRAbandonoRepository extends JpaRepository<TXRAbandono, Long> {
}
