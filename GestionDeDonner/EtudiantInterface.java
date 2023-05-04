package com.example.examjavafx.GestionDeDonner;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class EtudiantInterface extends Application {

    // Liste observable de coordonnées
    private ObservableList<String> coordonnees = FXCollections.observableArrayList();

    // Champ de texte pour les coordonnées
   // private TextField coordonneesField = new TextField();
    private TextField nomField = new TextField();
    private TextField prenomField = new TextField();
    private TextField ageField = new TextField();
    private TextField adresseField = new TextField();
    private TextField numField = new TextField();


    // Liste des coordonnées
    private ListView<String> coordonneesList = new ListView<>();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Ajout de coordonnées");

        // Créer l'étiquette pour le champ de texte
        Label nomLabel = new Label("Nom:");
        Label prenomLabel = new Label("Prenom:");
        Label ageLabel = new Label("age:");
        Label adresseLabel = new Label("Adresse:");
        Label numLabel = new Label("NumeroEtudiant:");

        // Créer le bouton "Ajouter"
        Button addButton = new Button("Ajouter");
        addButton.setOnAction(e -> ajouterCoordonnees());

        // Créer le bouton "modifier"
        Button updateButton = new Button("Modifier");
        addButton.setOnAction(e -> ModifierCoordonnees());

        // Créer le bouton "Supprimer"
        Button deletButton = new Button("Supprimer");
        addButton.setOnAction(e -> SupprimerCoordonnees());

        // Créer un conteneur pour les boutons
        HBox buttonBox = new HBox();
        buttonBox.getChildren().addAll(addButton);
        buttonBox.setSpacing(10);

        // Créer un conteneur pour les champs de texte et les étiquettes
        GridPane inputGrid = new GridPane();
        inputGrid.addRow(0, nomLabel, nomField);
        inputGrid.addRow(1, prenomLabel, prenomField);
        inputGrid.addRow(2, ageLabel, ageField);
        inputGrid.addRow(3, adresseLabel, adresseField);
        inputGrid.addRow(4, numLabel, numField);
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
    private void SupprimerCoordonnees() {
    }
    private void ModifierCoordonnees() {
        // Récupérer l'élément sélectionné dans le ListView
        ListView<Object> donneesList = new ListView<>();
        int selectedIndex = donneesList.getSelectionModel().getSelectedIndex();
        if (selectedIndex >= 0) {
            // Récupérer les anciennes données
            String nom= (String) donneesList.getItems().get(selectedIndex);
            String prenom= (String) donneesList.getItems().get(selectedIndex);
            String age= (String) donneesList.getItems().get(selectedIndex);
            String adresse= (String) donneesList.getItems().get(selectedIndex);
            String num= (String) donneesList.getItems().get(selectedIndex);


            // Créer un champ de texte pour saisir les nouvelles données
            TextField nvnom = new TextField(nom);
            TextField nvprenom = new TextField(prenom);
            TextField nvage = new TextField(age);
            TextField nvadr = new TextField(adresse);
            TextField nvnum = new TextField(num);

            // Créer un conteneur pour le champ de texte et le bouton "Modifier"
            VBox inputBox = new VBox();
            inputBox.getChildren().addAll(nvnom, nvprenom,nvage,nvadr,nvnum);

            inputBox.setSpacing(10);
            inputBox.setPadding(new Insets(10));

            // Créer une fenêtre de dialogue pour saisir les nouvelles données
            Stage dialogStage = new Stage();
            dialogStage.initModality(Modality.WINDOW_MODAL);
            dialogStage.setScene(new Scene(inputBox, 250, 100));
            dialogStage.showAndWait();

            // Si l'utilisateur a cliqué sur "Modifier"
            boolean modifierClicked = false;
            if (modifierClicked) {
                // Récupérer les nouvelles données
                String nvnomText =nvnom.getText();
                String nvprenomText =nvprenom.getText();
                String nvageText =nvage.getText();
                String nvadressText =nvadr.getText();
                String nvnumText =nvnum.getText();

                // Modifier les données dans la liste
                donneesList.getItems().set(selectedIndex, nvnom);
            }
        } else {
            // Aucun élément sélectionné, afficher un message d'erreur
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Aucune sélection");
            alert.setHeaderText("Aucune donnée sélectionnée");
            alert.setContentText("Veuillez sélectionner une donnée dans la liste.");
            alert.showAndWait();
        }
    }

    /**
     * Ajoute les coordonnées saisies à la liste.
     */

    private void ajouterCoordonnees() {
        String nomText = nomField.getText();
        String prenomText = prenomField.getText();
        String ageText = ageField.getText();
        String adresseText = adresseField.getText();
        String numText = numField.getText();
        if (!nomText.isEmpty() ||!prenomText.isEmpty() || !ageText.isEmpty() ||!adresseText.isEmpty() || !numText.isEmpty()) {
            coordonnees.add(nomText);
            nomField.clear();
            coordonnees.add(prenomText);
            prenomField.clear();
            coordonnees.add(ageText);
            ageField.clear();
            coordonnees.add(adresseText);
            adresseField.clear();
            coordonnees.add(numText);
            numField.clear();
        }
    }

}