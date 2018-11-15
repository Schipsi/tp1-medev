package com.monopoly;

/**
*Classe qui permet de définir les caractéristiques des cases non-achetables (type de case, prix)
* ainsi que les méthodes permettant de modéliser les comportements de ces cases
*/
public abstract class CaseNonAchetable extends Case {

    public CaseNonAchetable (String nom) {
        super(nom);
    }

	/**
	* Methode qui permet de modéliser l'interaction entre une case et le joueur qui passe sur cette case
	* @param j représente le joueur qui effectue l'action sur la case
	*/
	public abstract void action(Joueur j);

	public String toString(){
		return(this.nom);
	}
}
