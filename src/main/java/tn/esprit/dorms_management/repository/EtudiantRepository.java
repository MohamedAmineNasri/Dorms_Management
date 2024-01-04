package tn.esprit.dorms_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.dorms_management.entity.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
}
