package ma.octo.assignement.repository;

import ma.octo.assignement.domain.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte, Long> {
  Compte findByNumeroCompte(String nrCompte);
  Compte findByRib(String rib);

}
