/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1.medev;

import java.util.LinkedList;

/**
 * Permet de piocher des cartes de chances
 * @author ouissal ait rholofo
 */
public class Chance extends Pioche {
     public Chance() {
        super();

}
     
    public void action(Joueur j, Plateau p){
     LinkedList<Carte> cartesC=p.getCartesChance();
     if (cartesC.size()>=1)
     {
     Carte cartepiochee=cartesC.remove();
     cartepiochee.effet(j);
     cartesC.addLast(cartepriochee);
     p.setCartesChance(cartesC);
     }
     }
    
    
}
