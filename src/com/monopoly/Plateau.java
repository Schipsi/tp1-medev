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
    
    public int nbGares(Joueur j) {
        return 0;
    }
    
    public void affiche() {

    }
    
    public void avance(Case c, int n) {
        
    }
    
    public void initPlateau() {
        
    }
    
    public void addJoueur(Joueur j) {
        this.joueurs.add(j);
    }
    
    public void deleteJoueur(Joueur j) {
        
    }
    
    public void addCase(Case c) {
        this.plateau.add(c);
    }

    public void deleteCase(Case c) {
        
    }
    
    public void getCase(int n) {
        
    }
}
