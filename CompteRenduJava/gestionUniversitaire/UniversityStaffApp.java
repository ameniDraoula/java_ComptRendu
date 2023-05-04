package com.example.examjavafx.CompteRenduJava.gestionUniversitaire;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.Scanner;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import javax.swing.text.AttributeSet;
import javax.swing.text.Document;
import javax.swing.text.Element;

public class UniversityStaffApp extends Application {
    public static ArrayList<Element> elements;
    private Label nomLabel;
    private Label prenomLabel;
    private Label quantiteLabel;
    private Label ageLabel;
    private TextField nomField;
    private TextField prenomField;
    private TextField quantiteField;
    private TextField ageField;

    public void start(Stage primaryStage) {
        this.elements = new ArrayList();
        this.nomLabel = new Label("Nom :");
        this.nomField = new TextField();
        this.prenomLabel = new Label("Prénom :");
        this.prenomField = new TextField();
        this.quantiteLabel = new Label("Quantité :");
        this.quantiteField = new TextField();
        this.ageLabel = new Label("Âge :");
        this.ageField = new TextField();
        Button ajouterButton = new Button("Ajouter");
        ajouterButton.setOnAction((e) -> {
            this.ajouterElement();
        });
        Button supprimerButton = new Button("Supprimer");
        supprimerButton.setOnAction((e) -> {
            this.supprimerElement();
        });
        Button afficherButton = new Button("Afficher");
        afficherButton.setOnAction((e) -> {
            Label label=new Label();
            this.afficherInventaire(label);
        });
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10.0);
        grid.setVgap(10.0);
        grid.setPadding(new Insets(25.0, 25.0, 25.0, 25.0));
        grid.add(this.nomLabel, 0, 1);
        grid.add(this.nomField, 1, 1);
        grid.add(this.prenomLabel, 0, 2);
        grid.add(this.prenomField, 1, 2);
        grid.add(this.quantiteLabel, 0, 3);
        grid.add(this.quantiteField, 1, 3);
        grid.add(this.ageLabel, 0, 4);
        grid.add(this.ageField, 1, 4);
        HBox buttonBox = new HBox();
        buttonBox.setAlignment(Pos.CENTER);
        buttonBox.setSpacing(10.0);
        buttonBox.getChildren().addAll(new Node[]{ajouterButton, supprimerButton, afficherButton});
        VBox vbox = new VBox();
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(10.0);
        vbox.getChildren().addAll(new Node[]{grid, buttonBox});
        Scene scene = new Scene(vbox, 400.0, 300.0);
        primaryStage.setTitle("Inventaire");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    private void ajouterElement() {
        String nom = this.nomField.getText();
        String prenom = this.prenomField.getText();
        int quantite = Integer.parseInt(this.quantiteField.getText());
        int age = Integer.parseInt(this.ageField.getText());
        this.elements = new ArrayList(this.elements);
        Element nouvelElement = new Element(this, nom, prenom, quantite, age) {
            @Override
            public Document getDocument() {
                return null;
            }

            @Override
            public Element getParentElement() {
                return null;
            }

            @Override
            public String getName() {
                return null;
            }

            @Override
            public AttributeSet getAttributes() {
                return null;
            }

            @Override
            public int getStartOffset() {
                return 0;
            }

            @Override
            public int getEndOffset() {
                return 0;
            }

            @Override
            public int getElementIndex(int offset) {
                return 0;
            }

            @Override
            public int getElementCount() {
                return 0;
            }

            @Override
            public Element getElement(int index) {
                return null;
            }

            @Override
            public boolean isLeaf() {
                return false;
            }
        };
        this.elements.add(nouvelElement);
        this.nomField.setText("");
        this.prenomField.setText("");
        this.quantiteField.setText("");
        this.ageField.setText("");
        System.out.println("L'élément a été ajouté avec succès !");
    }
    public void supprimerElement() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Liste des éléments :");

        int indice;
        for(indice = 0; indice < this.elements.size(); ++indice) {
            Element element = (Element)this.elements.get(indice);
            System.out.println(indice + 1 + ". " + element.getNom() + " " + element.getPrenom() + " (" + element.getQuantite() + ", " + element.getAge() + ")");
        }

        System.out.print("Entrez l'indice de l'élément à supprimer : ");
        indice = scanner.nextInt();
        if (indice > 0 && indice <= this.elements.size()) {
            this.elements.remove(indice - 1);
            System.out.println("L'élément a été supprimé avec succès !");
        } else {
            System.out.println("Indice invalide !");
        }

    }
    public void afficherInventaire(Label label) {
        String texte = "Liste des éléments :\n";
        for(int i = 0; i < this.elements.size(); ++i) {
            Element element = (Element)this.elements.get(i);
            texte += (i + 1) + ". " + element.getNom() + " " + element.getPrenom() + " (" + element.getQuantite() + ", " + element.getAge() + ")\n";
        }
        label.setText(texte);

    }
    public String getNom(int index) {
        return ((Element)this.elements.get(index)).getNom();
    }

    public String getPrenom(int index) {
        return ((Element)this.elements.get(index)).getPrenom();
    }

    public String getQuantite(int index) {
        return ((Element)this.elements.get(index)).getName();
    }

    public String getAge(int index) {
        return ((Element)this.elements.get(index)).getName();
    }

    public static void main(String[] args) {
        launch(args);
    }}