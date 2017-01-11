package fr.sorbonne.miage.atelier.dev.l3;

import java.util.ArrayList;
import java.util.List;


public class Etudiant {

    public String nom;

    public String prenom;

    private String numeroInsee;

    public String numeroMobile;

    public List<Cours> listeCours = new ArrayList<Cours> ();

    String getNom() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.nom;
    }

    void setNom(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.nom = value;
    }

    String getPrenom() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.prenom;
    }

    void setPrenom(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.prenom = value;
    }

    /**
     * @return the numeroInsee
     */
    public String getNumeroInsee() {
        return numeroInsee;
    }

    /**
     * @param numeroInsee the numeroInsee to set
     */
    public void setNumeroInsee(String numeroInsee) {
        this.numeroInsee = numeroInsee;
    }

}
