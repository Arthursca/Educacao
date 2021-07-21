package projeto.educacao.repository.txr;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projeto.educacao.model.txr.TXREnsinoMedio;

@Repository
public interface TXREnsinoMedioRepository extends JpaRepository<TXREnsinoMedio, Long> {
}
