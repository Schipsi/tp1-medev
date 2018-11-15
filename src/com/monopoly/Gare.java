package com.monopoly;

/**
 *
 * @author Ismail
 */
public abstract class Gare extends CaseAchetable {
    
    /**
     * Le propriétaire de la gare
    */
    public Joueur proprietaire;

     /**
      * Cosntructeur sans paramètres
      */
     public Gare() {
         super();
     }
    
    /**
     * Constructeur avec params
     * @param nom
     * @param prix
     * @param proprietaire
     */
    public Gare (String nom, int prix, Joueur proprietaire) {
        super(nom, prix, proprietaire);
    }
    
    
    /**
     * 
     * @param J
     * @return Retourne le loyer en fonction du joueur
     */
    public int loyer(Joueur J) {
       if (this.getProprietaire() == null|| this.getProprietaire() == J) {
           return 0;
       }
       else {
           return 2500*J.getNbGare();
       }
       
    }
    
    /**
     *
     * @param J
     */
    public void acheter(Joueur J) {
        if (this.getProprietaire() == J){
            System.out.println("Vous etes deja le proprietaire :)");
        }
        else {
       this.setProprietaire(J);
        }
    }
    
    /**
     *
     * @return Retourne le cout d'achat d'une gare, en indiquant son proprietaire si celle en possede un
     */
    public String toSting() {
        String res;
        if (this.getProprietaire() == null) {
        res = this.getNom() + "(coût :" + this.getPrix() + "euros) - sans proprietaire";
        }
        else {
        res = this.getNom() + "(coût :" + this.getPrix() + "euros) - proprietaitre : " + getProprietaire();
    }
        return res;
}
}
