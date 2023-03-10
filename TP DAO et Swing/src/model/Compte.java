package model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Compte  extends Utilisateur {

    private static long          compteur = 1;
    private String          numeroCompte;
    private Double          solde;
    private LocalDateTime dateCreation;
    private Client          propriétaire;
    private List<Log> logs = new ArrayList<>();



    public Compte(){
        setNumeroCompte();
        setDateCreation();
        setSolde(0.0);
        setPropriétaire(null);
    }
    public Compte(Compte compte){

        setId(compte.getId());
        setDateCreation();
        setSolde(compte.solde);
        setPropriétaire(compte.propriétaire);
    }

    public Compte(long id, LocalDate dateCreation, Double solde, String propriétaire) {
        setId(id);
        setNumeroCompte();
        setDateCreation();
        setSolde(solde);
        setPropriétaire(new Client(propriétaire));
    }


    public void setDateCreation() { this.dateCreation = LocalDateTime.now(); }
    public void setPropriétaire(Client propriétaire) {
        this.propriétaire = propriétaire;
    }
    public void setSolde(Double solde) {
        this.solde = solde;
    }
    public void setLog(TypeLog type, String msg) {

        Log log = new Log(LocalDate.now(), LocalTime.now(), type, msg);
        logs.add(log);
    }

    public Client           getPropriétaire() {
        return propriétaire;
    }
    public Double           getSolde() {
        return solde;
    }
    public String getNumeroCompte() {
        return numeroCompte;
    }
    public void setNumeroCompte() {
        this.numeroCompte = "b-co00" + compteur++;
    }
    public LocalDateTime    getDateCreation() {
        return dateCreation;
    }
    public List<Log>        getLogs() {
        return logs;
    }




    @Override
    public String toString() {

        String      compteStr  = "------------------------------------------------------\n";
        compteStr += "| N° de Compte            : "   + getNumeroCompte()   + "\n";
        compteStr += "| Solde du Compte         : "   + getSolde()    + " Dh\n" ;
        compteStr += "| Propriétaire du Compte  : "   + getPropriétaire().getNomComplet() + "\n" ;
        compteStr += "------------------------------------------------------\n";

        return compteStr;
    }



}
