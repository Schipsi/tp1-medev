/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.monopoly;

import java.util.*;
/**
 *
 * @author GUO
 */
public class Carte {
    
    public boolean stockable;
    public int effet;
    
    
    /**
     * Ce constructeur permet d'instancier une Carte par defaut
     */
    public Carte() {
        effet=0;
        stockable=false;
        
    }

    public boolean isStockable() {
        return stockable;
    }

    public void setStockable(boolean stockable) {
        this.stockable = stockable;
    }

    public int getEffet() {
        return effet;
    }

    public void setEffet(int effet) {
        this.effet = effet;
    }
      
    public String toString(){
        return "carte "+"stockable"+ this.isStockable()+ "effet "+this.getEffet();
    }
    
       
    /**
     * Cette methode permet de realiser l'effet d'une carte sur le joueur
     * @param Joueur joueur qui est sur la case Chance ou CaisseDeCommunaute
     */
    public void effet (Joueur J) {
        Random random = new Random();
        int n = random.nextInt(10);
        if (n%2 != 0) {
            J.setFortune(J.getFortune()+50);
        } else {
            J.estEnPrison();
        }
    }
}
