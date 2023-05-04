package com.example.examjavafx.GestionDeDonner;

public class Professeur extends Personne {
    private String specialite;

    public Professeur(String nom, String prenom, String adresse, int age, String specialite) {
        super(nom, prenom, adresse, age);
        this.specialite = specialite;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
}
