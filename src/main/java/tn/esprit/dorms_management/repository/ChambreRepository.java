package tn.esprit.dorms_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.dorms_management.entity.Chambre;

public interface ChambreRepository extends JpaRepository<Chambre,Long> {
}
