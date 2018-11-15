package com.monopoly;

/**
 *
 * @author Ismail
 */
public class Gare extends CaseAchetable {
    
    /**
     * Constructeur sans parametre
     */
    public Gare () {
        super ();
    }
    
    /**
     * Constructeur recopieur
     * @param G
     */
    public Gare (Gare G) {
        super (G);
    }
    
    /**
     * Constructeur avec params
     * @param nom
     * @param prix
     * @param proprio
     */
    public Gare (String nom, int prix, Joueur proprio) {
        super (nom, prix, proprio);
    }
    
    
    /**
     * 
     * @param J
     * @return Retourne le loyer en fonction du joueur
     */
    public int loyer(Joueur J) {
       if (this.proprio == NULL|| this.proprio == J) {
           return 0;
       }
       else {
           return 2500*J.nbGare;
       }
       
    }
    
    /**
     *
     * @param J Le joueur qui passe par la gare et qui souhaite l'acheter, en devient le proprio
     * @return
     */
    public Joueur acheter(Joueur J) {
        if (this.proprio == J){
            System.out.println("Vous etes deja le proprietaire :)");
        }
        else {
       this.proprio = J;
        }
    }
    
    /**
     *
     * @return Retourne le cout d'achat d'une gare, en indiquant son proprietaire si celle en possede un
     */
    public String toSting() {
        if (this.proprio == NULL) {
        System.out.println(this.nom + "(coût :" + this.prix + "euros) - sans proprietaire");
        }
        else {
        System.out.println(this.nom + "(coût :" + this.prix + "euros) - proprietaitre : " + J.nom);
    }
}
