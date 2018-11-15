package com.monopoly;

/**
 *case qui rermet de piocher des cartes de communauté
 * @author ouissal ait rholofo
 */
public class CaisseDeCommunaute extends Pioche {

    public CaisseDeCommunaute() {
        super();
    }

    public void action(Joueur j){}

    public String toString(){
        String res= this.getClass().getName();
        return res;
    }

}
