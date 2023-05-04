package com.example.examjavafx.GestionDeDonner;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class EtudiantController implements Initializable {

    @FXML
    private TableView<Etudiant> etudiantTable;

    @FXML
    private TableColumn<Etudiant, String> nomColumn;

    @FXML
    private TableColumn<Etudiant, String> prenomColumn;
    private TableColumn<Etudiant, String> adresse;
    @FXML
    private TableColumn<Etudiant, Integer> ageColumn;

    @FXML
    private TableColumn<Etudiant, String> filiereColumn;

    @FXML
    private TableColumn<Etudiant, Integer> numEtudiantColumn;

    private ObservableList<Etudiant> etudiantData = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Instancier des étudiants
        Etudiant etudiant1 = new Etudiant("Dupont", "Jean", 20, "Informatique", 123456);
        Etudiant etudiant2 = new Etudiant("Martin", "Lucie", 22, "Mathématiques", 234567);
        Etudiant etudiant3 = new Etudiant("Leclerc", "Pierre", 23, "Physique", 345678);

        // Ajouter des étudiants à la liste
        etudiantData.addAll(etudiant1, etudiant2, etudiant3);

        // Configurer les colonnes du TableView avec les propriétés de la classe Etudiant
        nomColumn.setCellValueFactory(new PropertyValueFactory<>("nom"));
        prenomColumn.setCellValueFactory(new PropertyValueFactory<>("prenom"));
        adresse.setCellValueFactory(new PropertyValueFactory<>("adresse")); // s'il y a une propriété adresse dans la classe Etudiant
        ageColumn.setCellValueFactory(new PropertyValueFactory<>("age"));
        filiereColumn.setCellValueFactory(new PropertyValueFactory<>("filiere"));
        numEtudiantColumn.setCellValueFactory(new PropertyValueFactory<>("numEtudiant"));

        // Ajouter les données à la table
        etudiantTable.setItems(etudiantData);
    }}
