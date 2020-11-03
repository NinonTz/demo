package com.bankonet.entity;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
public class Client {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String nom;
    private String prenom;

    @OneToOne(mappedBy = "client", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    CompteCourant compteCourant;

    public Client(Integer id, String nom, String prenom, CompteCourant compteCourant
                  ) {

        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.compteCourant = compteCourant;
    }

    public Client() {

    }

    @Override
    public String toString() {
        return "Client{" +
                "identifiant='" + id + '\'' +
                ", nom='" + nom + '\'' +
                ", prénom='" + prenom + '\'' +
                ", compteCourant=" + compteCourant +
                '}';
    }

//    public double calculerAvoirGlobal() {

//    }


    public Integer getId() {
        return id;
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

    public CompteCourant getCompteCourant() {
        return compteCourant;
    }

    public void setCompteCourant(CompteCourant compteCourant) {
        this.compteCourant = compteCourant;
    }
}
