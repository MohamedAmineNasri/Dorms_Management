package tn.esprit.dorms_management.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.dorms_management.entity.*;
import tn.esprit.dorms_management.repository.*;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceImp implements IService{
    FoyerRepository foyerRepository;
    BlocRepository blocRepository;
    EtudiantRepository etudiantRepository;
    ReservationRepository reservationRepository;
    UniversiteRepository universiteRepository;
    ChambreRepository chambreRepository;

//    Foyer Start
    @Override
    public List<Foyer> retrieveAllFoyers() {
        return foyerRepository.findAll();
    }

    @Override
    public Foyer addFoyer(Foyer f) {
        return foyerRepository.save(f);
    }

    @Override
    public Foyer updateFoyer(Foyer f) {
        return foyerRepository.save(f);
    }

    @Override
    public Foyer retrieveFoyer(long idFoyer) {
        return foyerRepository.getReferenceById(idFoyer);
    }

    @Override
    public void removeFoyer(long idFoyer) {
        foyerRepository.deleteById(idFoyer);
    }

    //    Foyer End

    //Start Etudiant
    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant addEtudiants(Etudiant etudiants) {
        return etudiantRepository.save(etudiants);
    }


    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant retrieveEtudiant(long idEtudiant) {
        return etudiantRepository.findById(idEtudiant).orElse(null);
    }

    @Override
    public void removeEtudiant(long idEtudiant) {
            etudiantRepository.deleteById(idEtudiant);
    }
    //    Foyer Etudiant

    //Start Bloc
    @Override
    public List<Bloc> retrieveBlocs() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public Bloc retrieveBloc(long idBloc) {
        return blocRepository.findById(idBloc).orElse(null);
    }

    @Override
    public void removeBloc(long idBloc) {
        blocRepository.deleteById(idBloc);
    }

    @Override
    public Bloc affecterChambresABloc(List<Long> numChambre, long idBloc) {
        Bloc bloc = blocRepository.findById(idBloc).orElse(null);
        List<Chambre>chambres = chambreRepository.findChambresByNumeroChambreIn(numChambre);
        for (Chambre chambre:chambres) {
            chambre.setBloc(bloc);
            blocRepository.save(bloc);
        }
        return bloc;
    }


    //End Bloc

    // Start Universite
    @Override
    public List<Universite> retrieveAllUniversities() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite addUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public Universite updateUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public Universite retrieveUniversite(long idUniversite) {
        return universiteRepository.findById(idUniversite).orElse(null);
    }

    @Override
    public Universite affecterFoyerAUniversite(long idFoyer, String nomUniversite) {
        Universite universite =universiteRepository.findByNomUniversite(nomUniversite);
        universite.setFoyer(foyerRepository.findById(idFoyer).get());
        return universiteRepository.save(universite);
    }

    @Override
    public Universite desaffecterFoyerAUniversite(long idUniversite) {
        Universite universite = universiteRepository.findById(idUniversite).get();
        universite.setFoyer(null);
        return universiteRepository.save(universite);
    }


    //End Universite

    //Start Chambre
    @Override
    public List<Chambre> retrieveAllChambres() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre addChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public Chambre updateChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public Chambre retrieveChambre(long idChambre) {
        return chambreRepository.findById(idChambre).orElse(null);
    }

    //End Chambre

    //Start Reservation
    @Override
    public List<Reservation> retrieveAllReservation() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation updateReservation(Reservation res) {
        return reservationRepository.save(res);
    }

    @Override
    public Reservation retrieveReservation(String idReservation) {
        return reservationRepository.findById(idReservation).orElse(null);
    }
    //End Reservation
}
