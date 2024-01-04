package tn.esprit.dorms_management.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.dorms_management.entity.*;
import tn.esprit.dorms_management.service.ServiceImp;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/DormsController")
public class DormsController {
    ServiceImp serviceImp;
    //Start Foyer
    @PostMapping("addFoyer")
    public Foyer addingFoyer(@RequestBody Foyer foyer){
        return serviceImp.addFoyer(foyer);
    }
    @GetMapping("getAllFoyer")
    public List<Foyer> gettingAllFoyer(){
        return serviceImp.retrieveAllFoyers();
    }

    @GetMapping("getFoyer")
    public Foyer gettingFoyer(@RequestParam("idFoyer") long idFoyer){
        return serviceImp.retrieveFoyer(idFoyer);
    }

    @DeleteMapping("deletFoyer/{idFoyer}")
    public void deletingFoyer(@PathVariable("idFoyer") long idFoyer){
        serviceImp.removeFoyer(idFoyer);
    }

    @PutMapping("updateFoyer")
    public Foyer updatingFoyer(@RequestBody Foyer foyer){
        return serviceImp.updateFoyer(foyer);
    }
    //End Foyer

    //Etudiant Start
    @PostMapping("addEtudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant etudiant){
        return serviceImp.addEtudiants(etudiant);
    }
    @GetMapping("getAllEtudiant")
    public List<Etudiant> gettAllEtudiant(){
        return serviceImp.retrieveAllEtudiants();
    }

    @GetMapping("getEtudiant")
    public Etudiant getEtudiantr(@RequestParam("idEtudiant") long idEtudiant){

        return serviceImp.retrieveEtudiant(idEtudiant);
    }

    @DeleteMapping("deletEtudiant/{idEtudiant}")
    public void deletingEtudiant(@PathVariable("idEtudiant") long idEtudiant){

        serviceImp.removeEtudiant(idEtudiant);
    }

    @PutMapping("updateEtudiant")
    public Etudiant updatEtudiant(@RequestBody Etudiant etudiant){
        return serviceImp.updateEtudiant(etudiant);
    }
    //Etudiant End

    //Bloc Start
    @PostMapping("addBloc")
    public Bloc addBloc(@RequestBody Bloc bloc){

        return serviceImp.addBloc(bloc);
    }
    @GetMapping("getAllBloc")
    public List<Bloc> gettAllBloc(){

        return serviceImp.retrieveBlocs();
    }

    @GetMapping("getBloc")
    public Bloc getBloc(@RequestParam("idBloc") long idBloc){

        return serviceImp.retrieveBloc(idBloc);
    }

    @DeleteMapping("deletBloc/{idBloc}")
    public void deletingBloc(@PathVariable("idBloc") long idBloc){

        serviceImp.removeBloc(idBloc);
    }

    @PutMapping("updateBloc")
    public Bloc updatBloc(@RequestBody Bloc bloc){
        return serviceImp.updateBloc(bloc);
    }
    //Bloc End

    //Start Universite
    @PostMapping("addUniversite")
    public Universite addUniversite(@RequestBody Universite universite){

        return serviceImp.addUniversite(universite);
    }
    @GetMapping("getAllUniversite")
    public List<Universite> gettAllUniversite(){

        return serviceImp.retrieveAllUniversities();
    }

    @GetMapping("getUniversite")
    public Universite getUniversite(@RequestParam("idUniversite") long idUniversite){

        return serviceImp.retrieveUniversite(idUniversite);
    }


    @PutMapping("updateUniversite")
    public Universite updatUniversite(@RequestBody Universite universite){
        return serviceImp.updateUniversite(universite);
    }

    @PutMapping("affecter-foyer-universite/{idFoyer}")
    public Universite affecterFoyerAUniversite(@RequestParam ("nomUniversite") String nomUniversite ,
                                               @PathVariable long idFoyer){
            return serviceImp.affecterFoyerAUniversite(idFoyer,nomUniversite);
    }
    @PutMapping("desaffecterFoyerAUniversite/{idUniversite}")
    public Universite desaffecterFoyerAUniversite(@PathVariable long idUniversite) {
        return serviceImp.desaffecterFoyerAUniversite(idUniversite);
    }

    //End Universite

    // Start Chambre
    @PostMapping("addChambre")
    public Chambre addChambre(@RequestBody Chambre chambre){

        return serviceImp.addChambre(chambre);
    }
    @GetMapping("getAllChambre")
    public List<Chambre> gettAllChambre(){

        return serviceImp.retrieveAllChambres();
    }

    @GetMapping("getChambre")
    public Chambre getChambre(@RequestParam("idChambre") long idChambre){

        return serviceImp.retrieveChambre(idChambre);
    }


    @PutMapping("updateChambre")
    public Chambre updatChambre(@RequestBody Chambre chambre){
        return serviceImp.updateChambre(chambre);
    }
    // End Chambre

    //Start Reservation
    @GetMapping("getAllReservations")
    public List<Reservation> getAllReservations() {
        return serviceImp.retrieveAllReservation();
    }
    @PostMapping("updateReservation")
    public Reservation updateReservation (@RequestBody Reservation reservation) {
        return serviceImp.updateReservation(reservation);
    }
    @GetMapping("getReservation")
    public Reservation getReservation(@RequestParam("idReservation") String idReservation) {
        return serviceImp.retrieveReservation(idReservation);
    }
    //End Reservation
}
