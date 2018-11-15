package com.monopoly;

/**
 *Case qui permet de piocher des cartes de chances
 * @author ouissal ait rholofo
 */
public class Chance extends Pioche {

    public Chance() {
        super();
    }
     
    public void action(Joueur j){
   
     }
    
    public String toString(){
        String res= this.getClass().getName();
        return res;
    }

}
