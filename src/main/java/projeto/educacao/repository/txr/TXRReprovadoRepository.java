package projeto.educacao.repository.txr;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projeto.educacao.model.txr.TXRReprovado;

@Repository
public interface TXRReprovadoRepository extends JpaRepository<TXRReprovado, Long> {
}
