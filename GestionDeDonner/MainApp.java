package com.example.examjavafx.GestionDeDonner;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import javafx.stage.Stage;

public class MainApp extends Application {

    private TextField nomField;
    private TextField prenomField;
    private TextField adresseField;
    private TextField ageField;

    @Override
    public void start(Stage primaryStage) {
        // Créer les éléments de l'interface graphique
        Label nomLabel = new Label("Nom:");
        Label prenomLabel = new Label("Prénom:");
        Label adresseLabel = new Label("Adresse:");
        Label ageLabel = new Label("Âge:");
        nomField = new TextField();
        prenomField = new TextField();
        adresseField = new TextField();
        ageField = new TextField();
        Button validerButton = new Button("Valider");
        validerButton.setOnAction(e -> valider());

        // Créer une grille pour disposer les éléments
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(5);
        gridPane.setVgap(10);
        gridPane.add(nomLabel, 0, 0);
        gridPane.add(nomField, 1, 0);
        gridPane.add(prenomLabel, 0, 1);
        gridPane.add(prenomField, 1, 1);
        gridPane.add(adresseLabel, 0, 2);
        gridPane.add(adresseField, 1, 2);
        gridPane.add(ageLabel, 0, 3);
        gridPane.add(ageField, 1, 3);
        gridPane.add(validerButton, 1, 4);

        // Créer la scène et afficher la fenêtre
        Scene scene = new Scene(gridPane, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Saisie d'une personne");
        primaryStage.show();
    }

    private void valider() {
        // Récupérer les données saisies par l'utilisateur
        String nom = nomField.getText();
        String prenom = prenomField.getText();
        String adresse = adresseField.getText();
        int age = Integer.parseInt(ageField.getText());

        // Créer un objet personne avec les données saisies
        Personne personne = new Personne(nom, prenom, adresse, age);

        // Afficher les données dans la console
        System.out.println(personne);
    }

    public static void main(String[] args) {
        launch(args);
    }

}

