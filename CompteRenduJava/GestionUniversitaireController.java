package com.example.examjavafx.CompteRenduJava;

import java.util.List;

public interface GestionUniversitaireController {
    void ajouterEtudiant(Etudiant etudiant);
    void modifierEtudiant(Etudiant etudiant);
    void supprimerEtudiant(Etudiant etudiant);
    List<Etudiant> rechercherEtudiants(String nom);

    void ajouterProfesseur(Professeur professeur);
    void modifierProfesseur(Professeur professeur);
    void supprimerProfesseur(Professeur professeur);
    List<Professeur> rechercherProfesseurs(String nom);

    void ajouterProspect(Prospect prospect);
    void modifierProspect(Prospect prospect);
    void supprimerProspect(Prospect prospect);
    List<Prospect> rechercherProspects(String nom);
}