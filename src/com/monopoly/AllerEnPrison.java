package com.monopoly;

/**
 * Représente la case aller en prison qui envoie un joueur en prison dès qu'il est sur la case
 * @author ouissal ait rholofo
 */
public class AllerEnPrison extends CaseNonAchetable {
    
    public AllerEnPrison() {
        super("Aller En Prison");
    }
    
    public void action(Joueur j) {
        j.setPosition(10);
    }   
    
    public String toString(){
        String res= this.getClass().getName()+ " " + this.getNom();
        return res;
    }

}
