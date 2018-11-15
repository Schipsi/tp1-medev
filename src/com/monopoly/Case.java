package com.monopoly;
/**
 *Classe abstraite qui permet de modéliser une case
 *
 */
public abstract class Case {
    /**
	*nom indique le nom de la case
	*/
	
    private String nom;
    
	/**
	* @param nom représente le nom de la case
	*/
	
	public int getNom() {
        return nom;
    }
	
	public void setNom(int n_nom) {
        this.nom = n_nom;
    }
	
    public Case(String nom){
        this.nom = nom;
    }
}