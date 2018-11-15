/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.monopoly;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



/**
 *
 * @author Schipsi
 */
public class Plateau {
    
    /**
     * Cette liste contient les joueurs de la partie de Monopoly
     */
    public List<Joueur> joueurs = new LinkedList<>();
    
    /**
     * Cette liste contient les cases du plateau du Monopoly
     */
    public List<Case> plateau = new ArrayList<>();
    
    public void initPlateau() {
        
    }
    
    public void affiche() {
        for(Case c : plateau) {
            System.out.println(c.toString());
        }
    }
    
        
    public int nbGares(Joueur j) {
        int nbGare = 0;
        for (Case c : plateau) {
            if (c instanceof Gare && c.getProprio().equals(j)) {
                nbGare++;
            }
        }
        return nbGare;
    }

    public void addJoueur(Joueur j) {
        this.joueurs.add(j);
    }
    
    public void addCase(Case c) {
        this.plateau.add(c);
    }

    public void deleteCase(int n) {
        this.plateau.remove(n);
    }
    
    public Case getCase(int n) {
        return this.plateau.get(n);
    }

    public Case avance(Case c, int n) {
        return getCase(plateau.indexOf(c) + n);
    }
}
