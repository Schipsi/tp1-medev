package com.monopoly;
/**
*Classe qui permet de définir les caractéristiques des cases achetables (type de case, prix, propriétaires)
* ainsi que les méthodes permettant de modéliser les comportements de ces cases
*/

public abstract class CaseAchetable extends Case {

	private int prix;
	private Joueur proprietaire;

	public CaseAchetable(String nom, int prix, Joueur proprietaire) {
            super(nom);
            this.prix = prix;
            this.proprietaire = proprietaire;
	}
        
        public CaseAchetable(CaseAchetable c) {
            super(c);
            this.prix = 0;
            this.proprietaire = null;
        }
        
        public CaseAchetable() {
            super();
            this.prix = 0;
            this.proprietaire = null;
        }

	/**
	 * Methode qui permet de représenter le loyer qu'un joueur doit payer au proprio (si il y en a un)
	 */
	public abstract int loyer();

	/**
	 * Methode qui permet de définir un propriétaire si il n'existe pas encore
	 *
	 * @param investisseur personne qui veut acheter la case
	 */
	public void acheter(Joueur investisseur) {
		if (this.proprietaire == null) {
			setProprietaire(investisseur);
		} else {
			System.out.println("Il y a déjà un propriétaire");
		}
	}

	public int getPrix() {
		return prix;
	}

	public Joueur getProprietaire() {
		return proprietaire;
	}


	public void setPrix(int prix) {
		this.prix = prix;
	}

	public void setProprietaire(Joueur proprietaire) {
		this.proprietaire = proprietaire;
	}

}
