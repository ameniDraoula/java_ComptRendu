package com.example.examjavafx.GestionDeDonner;

public class Secretariat extends Personne {
    private String service;

    public Secretariat(String nom, String prenom, String adresse, int age, String service) {
        super(nom, prenom, adresse, age);
        this.service = service;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }
}


