package org.Gestion_Ecole.Manager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.Gestion_Ecole.Entities.Classe;

public class GestionClasses {
    private List<Classe> classes;

    public GestionClasses() {
        this.classes = new ArrayList<>();
    }

    public void ajouterClasse(Classe classe) {
        classes.add(classe);
    }

    public Classe getClasseParNom(String nom) {
        for (Classe classe : classes) {
            if (classe.getNom().equals(nom)) {
                return classe;
            }
        }
        return null;
    }

    // Getters

    public List<Classe> getClasses() {
        return classes;
    }
}

