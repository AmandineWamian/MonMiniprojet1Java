package org.Gestion_Ecole.Manager;

import java.util.List;

import org.Gestion_Ecole.Entities.Classe;
import org.Gestion_Ecole.Entities.Etudiant;

public class GestionEtudiants {
    public void ajouterÉtudiant(Classe classe, Etudiant etudiant) {
        classe.getEtudiants().add(etudiant);
    }

    public Etudiant getEtudiantParNom(Classe classe, String nom) {
        for (Etudiant etudiant : classe.getEtudiants()) {
            if (etudiant.getNom().equalsIgnoreCase(nom)) {
                return etudiant;
            }
        }
        return null;
    }

    public void AfficheListEtudiants(Classe classe) {
        System.out.println("La Liste des etudiants appartenant a la classe de "+classe.getNom());
        for (Etudiant etudiant : classe.getEtudiants()) {
            System.out.println(" Nom de l'Etudiant  "+classe.getEtudiants().indexOf(etudiant)+1+" )"+ etudiant.getNom());
        }
    }
}

