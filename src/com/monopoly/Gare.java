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
     */
    public Gare (Gare G) {
        super (G);
    }
    
    /**
     * Constructeur avec params
     */
    public Gare (String nom, int prix, Joueur proprio) {
        super (nom, prix, proprio);
    }
    
    
    /**
     * 
     * @return
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
     * @param J Le joueur qui passe par la gare
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
    
    public String toSting() {
        if (this.proprio == NULL) {
        System.out.println(this.nom + "(cout :" + this.prix + "euros) - sans proprietaire");
        }
        else {
        System.out.println(this.nom + "(cout :" + this.prix + "euros) - proprietaitre : " + J.nom ", " + J.nbma);
    }
}
