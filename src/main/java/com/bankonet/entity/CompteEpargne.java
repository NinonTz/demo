package com.bankonet.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class CompteEpargne {
    String numero;
    String intitule;
    double solde;
    double tauxInteret;
    private String id;

    public CompteEpargne(String numero, String intitule, double solde, double tauxInteret) {
        this.numero = numero;
        this.intitule = intitule;
        this.solde = solde;
        this.tauxInteret = tauxInteret;
    }

    public CompteEpargne() {

    }

    @Override
    public String toString() {
        return "CompteEpargne{" +
                "numero='" + numero + '\'' +
                ", intitule='" + intitule + '\'' +
                ", solde=" + solde +
                ", tauxInteret=" + tauxInteret +
                '}';
    }

    public void debiter(double solde) {

    }

    public void crediter(double solde) {

    }

    public double calculerInterets() {
        return tauxInteret;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Id
    public String getId() {
        return id;
    }
}
