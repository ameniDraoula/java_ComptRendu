package com.example.examjavafx.GestionDeDonner;

public class Etudiant extends Personne {
    private String filiere;
    private int numEtudiant;

    public Etudiant(String nom, String prenom, int age, String adresse, int numEtudiant) {
        super(nom, prenom, adresse,age);
        this.filiere = filiere;
        this.numEtudiant = numEtudiant;
    }

    // Getters et Setters
    public String getFiliere() {
        return filiere;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }

    public int getNumEtudiant() {
        return numEtudiant;
    }

    public void setNumEtudiant(int numEtudiant) {
        this.numEtudiant = numEtudiant;
    }
}