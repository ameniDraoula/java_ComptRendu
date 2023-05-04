package com.example.examjavafx.CompteRenduJava.gestionUniversitaire;

import com.example.examjavafx.CompteRenduJava.gestionUniversitaire.Etudiants;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GestionEtudiants implements ActionListener {
    private JFrame frame;
    private JPanel panel;
    private JLabel nomLabel, prenomLabel, matriculeLabel;
    private JTextField nomField, prenomField, matriculeField;
    private JButton ajouterButton, modifierButton, supprimerButton;
    private Object etudiant;

    // Constructeur pour initialiser la fenêtre principale
    public GestionEtudiants () {
        // Créer la fenêtre principale
        frame = new JFrame("Gestion des étudiants");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Créer le panel
        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        // Ajouter les composants au panel
        nomLabel = new JLabel("Nom : ");
        panel.add(nomLabel);
        nomField = new JTextField(20);
        panel.add(nomField);

        prenomLabel = new JLabel("Prénom : ");
        panel.add(prenomLabel);
        prenomField = new JTextField(20);
        panel.add(prenomField);

        matriculeLabel = new JLabel("Matricule : ");
        panel.add(matriculeLabel);
        matriculeField = new JTextField(20);
        panel.add(matriculeField);

        ajouterButton = new JButton("Ajouter");
        ajouterButton.addActionListener(this);
        panel.add(ajouterButton);

        modifierButton = new JButton("Modifier");
        modifierButton.addActionListener(this);
        panel.add(modifierButton);

        supprimerButton = new JButton("Supprimer");
        supprimerButton.addActionListener(this);
        panel.add(supprimerButton);

        // Ajouter le panel à la fenêtre
        frame.add(panel);

        // Afficher la fenêtre
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ajouterButton) {
            // Code pour ajouter un étudiant
        } else if (e.getSource() == modifierButton) {
            // Code pour modifier un étudiant
        } else if (e.getSource() == supprimerButton) {
            // Code pour supprimer un étudiant
        }
    }
    /*
    private void ajouterEtudiant() {
        String nom = nomField.getText();
        String prenom = prenomField.getText();
        int  matricule = Integer.parseInt(matriculeField.getText());
        Etudiant etudiant = new Etudiant(nom, prenom, matricule);
        List<Etudiant> listeEtudiants = new ArrayList<>();
        // Ajouter l'étudiant à la liste d'étudiants
        etudiant.add(etudiant);
        // Effacer les champs de saisie
        nomField.setText("");
        prenomField.setText("");
        matriculeField.setText("");
    }*/

    public static void main(String[] args) {
        new GestionEtudiants();
    }
}
