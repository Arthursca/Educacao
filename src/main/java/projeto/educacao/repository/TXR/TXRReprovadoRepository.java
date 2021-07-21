package projeto.educacao.repository.TXR;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projeto.educacao.model.TXR.TXRReprovado;

@Repository
public interface TXRReprovadoRepository extends JpaRepository<TXRReprovado, Long> {
}
