package tn.esprit.dorms_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.dorms_management.entity.Universite;

public interface UniversiteRepository extends JpaRepository<Universite,Long> {
    Universite findByNomUniversite(String nomUniversite);
}
