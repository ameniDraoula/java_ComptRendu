package com.example.examjavafx.CompteRenduJava;

// on vas faire une application de gestion universitaire qui permet d'ajouter,
// modifier et supprimer les données des différents groupes de personnes,
// et d'afficher les données de l'ensemble des groupes avec des interfaces graphiques différentes
// en  utilisant le modèle MVC (Modèle-Vue-Contrôleur) pour organiser le code.

public class Personne {
    private String nom;
    private String prenom;
    private String email;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}