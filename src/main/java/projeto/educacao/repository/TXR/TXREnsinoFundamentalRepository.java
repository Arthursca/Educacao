package projeto.educacao.repository.TXR;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import projeto.educacao.model.TXR.TXREnsinoFundamental;


@Repository
public interface TXREnsinoFundamentalRepository extends JpaRepository<TXREnsinoFundamental, Long> {

}
