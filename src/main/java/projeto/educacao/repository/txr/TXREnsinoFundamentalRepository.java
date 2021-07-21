package projeto.educacao.repository.txr;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import projeto.educacao.model.txr.TXREnsinoFundamental;


@Repository
public interface TXREnsinoFundamentalRepository extends JpaRepository<TXREnsinoFundamental, Long> {

}
