/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.monopoly;

import java.util.LinkedList;

/**
 * Represente une prison 
 * @author ouissal ait rholofo
 */
public class Prison extends CaseNonAchetable {
    
     /**
     *prix pour sortir de prison
     */

    private int prixSortie;

    /**
     *
     * @return
     */
    public int getPrixSortie() {
        return prixSortie;
    }

    /**
     *
     * @param prixSortie
     */
    public void setPrixSortie(int prixSortie) {
        this.prixSortie = prixSortie;
    }

    /**
     *
     */
    public Prison() {
        super();
        prixSortie = 50;
    }

    /**
     * sortir le joueur de prison soit via una carte sortir de prison ou si sa fortune est supérieure au prix
     * @param j
     */
    public void action(Joueur j) {
        if (j.getPrison() == true) {
            if (j.getCartes().size() >= 1) {
                j.setEnPrison(false);
                LinkedList<Carte> cartes = j.getCartes();
                cartes.remove();
            }
            else {
                
                if (j.getFortune() >= prixSortie)
                {
                j.setEnPrison(false);
                j.setFortune(j.setFortume()-prixSortie);
                }
            }

        }

    }
    
}
