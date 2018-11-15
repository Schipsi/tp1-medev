/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1.medev;

/**
 * Représente la case aller en prison qui envoie un joueur en prison dès qu'il est sur la case
 * @author ouissal ait rholofo
 */
public class AllerEnPrison extends CaseNonAchetable {
    
    public AllerEnPrison()
    {
    super();
    }
    
    public void action(Joueur j)
    {
    
        j.setPosition(10);
    }   
    
    public String toString(){
    
    String res= this.getClass().getName()+ " " + this.getNom();
    return res
    }
   
    
}
