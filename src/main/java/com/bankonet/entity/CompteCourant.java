package com.bankonet.entity;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class CompteCourant {
    String numero;
    String intitule;
    double solde;
    double montantDecouvertAutorise;
    private String id;

    public CompteCourant(String numero, String intitule, double solde, double montantDecouvertAutorise) {
        this.numero = numero;
        this.intitule = intitule;
        this.solde = solde;
        this.montantDecouvertAutorise = montantDecouvertAutorise;
    }

    public CompteCourant() {

    }

    @Override
    public String toString() {
        return "CompteCourant{" +
                "numero='" + numero + '\'' +
                ", intitule='" + intitule + '\'' +
                ", solde=" + solde +
                ", montantDecouvertAutorise=" + montantDecouvertAutorise +
                '}';
    }

    public void debiter(double solde) {

    }

    public void crediter(double solde) {

    }

    public void setId(String id) {
        this.id = id;
    }

    @Id
    public String getId() {
        return id;
    }
}
