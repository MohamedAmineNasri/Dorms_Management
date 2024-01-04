package tn.esprit.dorms_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.dorms_management.entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation,String> {
}
