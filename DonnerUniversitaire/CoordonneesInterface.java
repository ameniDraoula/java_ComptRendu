package com.example.examjavafx.DonnerUniversitaire;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CoordonneesInterface extends Application {

    // Liste observable de coordonnées
    private ObservableList<String> coordonnees = FXCollections.observableArrayList();

    // Champ de texte pour les coordonnées
    private TextField coordonneesField = new TextField();

    // Liste des coordonnées
    private ListView<String> coordonneesList = new ListView<>(coordonnees);

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Ajout de coordonnées");

        // Créer l'étiquette pour le champ de texte
        Label coordonneesLabel = new Label("Coordonnées:");

        // Créer le bouton "Ajouter"
        Button addButton = new Button("Ajouter");
        addButton.setOnAction(e -> ajouterCoordonnees());

        // Créer un conteneur pour les boutons
        HBox buttonBox = new HBox();
        buttonBox.getChildren().addAll(addButton);
        buttonBox.setSpacing(10);

        // Créer un conteneur pour les champs de texte et les étiquettes
        GridPane inputGrid = new GridPane();
        inputGrid.addRow(0, coordonneesLabel, coordonneesField);
        inputGrid.setHgap(10);
        inputGrid.setVgap(10);

        // Créer un conteneur pour les champs de texte et les boutons
        VBox inputBox = new VBox();
        inputBox.getChildren().addAll(inputGrid, buttonBox);
        inputBox.setSpacing(10);
        inputBox.setPadding(new Insets(10));

        // Ajouter les coordonnées à la liste
        coordonneesList.setItems(coordonnees);

        // Créer un conteneur pour la liste des coordonnées
        VBox listBox = new VBox();
        listBox.getChildren().addAll(coordonneesList);
        listBox.setSpacing(10);
        listBox.setPadding(new Insets(10));

        // Créer un conteneur principal
        HBox root = new HBox();
        root.getChildren().addAll(inputBox, listBox);
        root.setSpacing(10);
        root.setPadding(new Insets(10));

        // Afficher la fenêtre
        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Ajoute les coordonnées saisies à la liste.
     */
    private void ajouterCoordonnees() {
        String coordonneesText = coordonneesField.getText();
        if (!coordonneesText.isEmpty()) {
            coordonnees.add(coordonneesText);
            coordonneesField.clear();
        }
    }

}
