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
    
    /**
     * Cette liste contient les cartes CaisseDeCommunaute du Monopoly
     */
    public List<CaisseDeCommunaute> caisseDeCommunaute = new LinkedList<>();
    
    /**
     * Cette liste contient les cartes CaisseDeCommunaute du Monopoly
     */
    public List<Chance> chance = new LinkedList<>();
    
    public Plateau() {
        initPlateau();
    }
    
    public void initPlateau() {
        
    }
    
    public void affiche() {
        for(Case c : plateau) {
            System.out.println(c.toString());
        }
        for (Carte c : caisseDeCommunaute)
        {
            System.out.println(c.toString());
        }
        for (Carte c : chance)
        {
            System.out.println(c.toString());  
        }
        for (Joueur j : Joueur)
        {
            System.out.println(j.toString());  
        }
        
    }
    
        
    public int nbGares(Joueur j) {
        int nbGare = 0;
        for (Case c : plateau) {
            if (c instanceof Gare && ((Gare) c).getProprietaire().equals(j)) {
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
    
    public void addCarteCaisseDeCOmmunaute(CaisseDeCommunaute c) {
        this.caisseDeCommunaute.add(c);
    }
    
    public CaisseDeCommunaute piocherCarteCaisseDeCOmmunaute() {
        if (this.chance.size() > 0) {
            CaisseDeCommunaute carte = this.caisseDeCommunaute.get(0);
            this.caisseDeCommunaute.add(carte);
            this.caisseDeCommunaute.remove(0);
            return carte;
        } else {
            System.out.println("Pas de cartes caisse de communauté !");
            return null;
        }   
    }
    
    public void addCarteChance(Chance c) {
        this.chance.add(c);
    }
    
    public Chance piocherCarteChance() {
        if (this.chance.size() > 0) {
            Chance carte = this.chance.get(0);
            this.chance.add(carte);
            this.chance.remove(0);
            return carte;
        } else {
            System.out.println("Pas de cartes chance !");
            return null;
        }   
    }
}
