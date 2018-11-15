package com.monopoly;
/**
*Classe qui permet de définir les caractéristiques des cases achetables (type de case, prix, propriétaires)
* ainsi que les méthodes permettant de modéliser les comportements de ces cases
*/

public class CaseAchetable extends Case {
	
	private int prix;
	private Joueur proprietaire; 
	
	public CaseAchetable (String nom){
		super.(nom);
	}	
	
	public int getPrix() {
        return this.prix;
    }
	
	public void setPrix(int n_prix) {
        this.prix = n_prix;
    }
	
	public int getProprietaire() {
        return this.proprietaire;
    }
	
	public void setProprietaire(Joueur n_proprietaire) {
        this.proprietaire = n_proprietaire;
    }
	/**
	* Methode qui permet de représenter le loyer qu'un joueur doit payer au proprio (si il y en a un)
	*
	*/
	
	public abstract int loyer();
	
	/** 
	* Methode qui permet de définir un propriétaire si il n'existe pas encore
	* @param investisseur personne qui veut acheter la case
	*/
	public void acheter(Joueur investisseur){
		if (this.proprietaire == null){
			setProprietaire(Joueur);
		} else{
			System.out.println("Il y a déjà un propriétaire");
	}	
}
