package projeto.educacao.repository.TXR;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projeto.educacao.model.TXR.TXREnsinoMedio;

@Repository
public interface TXREnsinoMedioRepository extends JpaRepository<TXREnsinoMedio, Long> {
}
