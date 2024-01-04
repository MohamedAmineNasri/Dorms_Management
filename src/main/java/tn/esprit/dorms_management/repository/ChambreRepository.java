package tn.esprit.dorms_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.dorms_management.entity.Chambre;

import java.util.List;

public interface ChambreRepository extends JpaRepository<Chambre,Long> {
    List<Chambre> findChambresByNumeroChambreIn(List<Long> numChambre);
}
