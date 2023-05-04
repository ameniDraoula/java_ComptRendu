package com.example.examjavafx.GestionDeDonner;

public class Prospects extends Personne {
    private String email;
    private String telephone;

    public Prospects(String nom, String prenom, String adresse, int age, String email, String telephone) {
        super(nom, prenom, adresse, age);
        this.email = email;
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
