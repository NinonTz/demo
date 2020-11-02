package com.bankonet.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Client {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String identifiant;
    private String nom;
    private String prenom;

//    CompteCourant compteCourant;
//    CompteEpargne compteEpargne;

    public Client(String identifiant, String nom, String prenom //CompteCourant compteCourant, CompteEpargne compteEpargne
                  ) {

        this.identifiant = identifiant;
        this.nom = nom;
        this.prenom = prenom;
//        this.compteCourant = compteCourant;
//        this.compteEpargne = compteEpargne;
    }

    public Client() {

    }

    @Override
    public String toString() {
        return "Client{" +
                "identifiant='" + identifiant + '\'' +
                ", nom='" + nom + '\'' +
                ", prénom='" + prenom + '\'' +
//                ", compteCourant=" + compteCourant
//                ", compteEpargne=" + compteEpargne +
                '}';
    }

//    public double calculerAvoirGlobal() {

//    }


    public String getIdentifiant() {
        return identifiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
