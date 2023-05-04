package com.example.examjavafx.CompteRenduJava.gestionUniversitaire;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Etudiants {
    private SimpleStringProperty nom;
    private SimpleStringProperty prenom;
    private SimpleIntegerProperty age;
    private SimpleStringProperty niveau;

    public Etudiants(String nom, String prenom, int age, String niveau) {
        this.nom = new SimpleStringProperty(nom);
        this.prenom = new SimpleStringProperty(prenom);
        this.age = new SimpleIntegerProperty(age);
        this.niveau = new SimpleStringProperty(niveau);
    }

    public String getNom() {
        return nom.get();
    }

    public void setNom(String nom) {
        this.nom.set(nom);
    }

    public String getPrenom() {
        return prenom.get();
    }

    public void setPrenom(String prenom) {
        this.prenom.set(prenom);
    }

    public int getAge() {
        return age.get();
    }

    public void setAge(int age) {
        this.age.set(age);
    }

    public String getNiveau() {
        return niveau.get();
    }

    public void setNiveau(String niveau) {
        this.niveau.set(niveau);
    }
}
