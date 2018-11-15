/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1.medev;

import java.util.LinkedList;

/**
 *Permet de piocher des cartes de communauté
 * @author ouissal ait rholofo
 */
public class CaisseDeCommunaute extends Pioche {
     public CaisseDeCommunaute() {
        super();

}
     public void action(Joueur j, Plateau p){
     LinkedList<Carte> cartesC=p.getCartesCaisseCommunaute();
     if (cartesC.size()>=1)
     {
     Carte cartepiochee=cartesC.remove();
     cartesC.addLast(cartepriochee);
     
     
     }
     
     
     }
    
}
