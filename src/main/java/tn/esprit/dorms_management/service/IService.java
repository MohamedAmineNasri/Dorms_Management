package tn.esprit.dorms_management.service;

import tn.esprit.dorms_management.entity.*;

import java.util.List;


public interface IService {
    // Start FOyer
    List<Foyer> retrieveAllFoyers();

    Foyer addFoyer (Foyer f);

    Foyer updateFoyer (Foyer f);

    Foyer retrieveFoyer (long idFoyer);

    void removeFoyer (long idFoyer);
    // End FOyer

    //Start Etudiant
    List<Etudiant> retrieveAllEtudiants();

    Etudiant addEtudiants (Etudiant etudiants);

    Etudiant updateEtudiant (Etudiant e);

    Etudiant retrieveEtudiant(long idEtudiant);

    void removeEtudiant(long idEtudiant);
    //End Etudiant

    //Start Bloc
    List<Bloc> retrieveBlocs();

    Bloc updateBloc (Bloc bloc);

    Bloc addBloc (Bloc bloc);

    Bloc retrieveBloc (long idBloc);

    void removeBloc (long idBloc);
    //End Bloc

    //Start Universite
    List<Universite> retrieveAllUniversities();

    Universite addUniversite (Universite u);

    Universite updateUniversite (Universite u);

    Universite retrieveUniversite (long idUniversite);

    public Universite affecterFoyerAUniversite (long idFoyer, String nomUniversite);
    public Universite desaffecterFoyerAUniversite (long idUniversite);
    //End Universite

    // Start Chambre
    List<Chambre> retrieveAllChambres();

    Chambre addChambre(Chambre c);

    Chambre updateChambre (Chambre c);

    Chambre retrieveChambre (long idChambre);
    //End Chambre

    //Start Reservation
    List<Reservation> retrieveAllReservation();

    Reservation updateReservation (Reservation res);

    Reservation retrieveReservation (String idReservation);
    //End Reservation
}
