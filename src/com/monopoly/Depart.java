/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1.medev;

/**
 *
 * @author ouissal ait rholofo
 */
public class Depart extends CaseNonAchetable {
    public Depart() {
        super();

}
    public void action(Joueur j)
    {
    
    }
    
       public String toString(){
    
    String res= this.getClass().getName()+ " " + this.getNom();
    return res
    }
}
