package org.Gestion_Ecole.Manager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.Gestion_Ecole.Entities.Matiere;

public class GestionMatieres {
    private List<Matiere> matieres;

    public GestionMatieres() {
        this.matieres = new ArrayList<>();
    }

    public void ajouterMatiere(Matiere matiere) {
        matieres.add(matiere);
    }

    public Matiere getMatiereParNom(String nom) {
        for (Matiere matiere : matieres) {
            if (matiere.getNom().equals(nom)) {
                return matiere;
            }
        }
        return null;
    }

    // Getters

    public List<Matiere> getMatières() {
        return matieres;
    }
}
