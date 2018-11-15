/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.monopoly;

/**
 *
 * @author Atimcos/Cosmita/Cosme
 */
public class Taxe extends CaseNonAchetable{
    
    /**
     * Montant à payer par le joueur donc montant est positif ou nul
     */
    public int montant;
    
    /**
     *
     * @param montant Montant à payer par le joueur >0
     * @param nom Nom de la case
     */
    
    public Taxe(String nom, int montant) {
        super(nom);
        this.montant = 0;
    }
    
    public Taxe() {
        super();
        this.montant = 0;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }
}
