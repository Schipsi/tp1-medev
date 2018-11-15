package com.monopoly;

/**
 *
 * @author Ismail
 */
public class Gare extends CaseAchetable {
    
    /**
     * Constructeur sans parametre
     */
    public Gare(String nom) {
        super(nom);
    }
    
    /**
     * Constructeur recopieur
     * @param G
     */
     public Gare(Gare g) {
        super(
            (CaseAchetable)g
        );
    }
     
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
        super (nom, prix, proprietaire);
    }
    
    
    /**
     * 
     * @param J
     * @return Retourne le loyer en fonction du joueur
     */
    public int loyer(Joueur J) {
       if (this.getProprietaire() == NULL|| this.getProprietaire() == J) {
           return 0;
       }
       else {
           return 2500*J.getNbGare();
       }
       
    }
    
    /**
     *
     * @param J Le joueur qui passe par la gare et qui souhaite l'acheter, en devient le proprio
     * @return
     */
    public Joueur acheter(Joueur J) {
        if (this.getProprietaire() == J){
            System.out.println("Vous etes deja le proprietaire :)");
        }
        else {
       this.getProprietaire() = J;
        }
    }
    
    /**
     *
     * @return Retourne le cout d'achat d'une gare, en indiquant son proprietaire si celle en possede un
     */
    public String toSting() {
        if (this.getProprietaire() == null) {
        System.out.println(this.nom + "(coût :" + this.getPrix() + "euros) - sans proprietaire");
        }
        else {
        System.out.println(this.nom + "(coût :" + this.getPrix() + "euros) - proprietaitre : " + J.getNom());
    }
}
