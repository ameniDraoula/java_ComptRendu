package com.example.examjavafx.CompteRenduJava;

public class Etudiant extends Personne {
    private String matricule;
    private String filiere;

    public Etudiant(String nom, String prenom, int matricule) {
        super();
    }


    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getFiliere() {
        return filiere;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }
}