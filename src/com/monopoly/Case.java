package com.monopoly;
/**
 *Classe abstraite qui permet de modéliser une case
 *
 */
public abstract class Case {

    /**
     * nom indique le nom de la case
     */
    private String nom;

    public Case(String nom){
        this.nom = nom;
    }
    
    public Case(Case c) {
        this.nom = c.getNom();
    }
    
    public Case() {
        this.nom = "";
    }

    public String getNom() {
        return nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
	
	public abstract String toString();
}