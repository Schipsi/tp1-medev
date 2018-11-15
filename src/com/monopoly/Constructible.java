/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

/**
 *
 * @author Saadate
 */
public class Constructible extends CaseAchetable {

    /**
     * Cet attribut représente le nombre de maisons sur la case
     */
    public int maison;

    /**
     * Cet attribut représente la possibilité de construire un (unique) hôtel sur la case
     */
    public boolean hotel;
    
    

    /**
     * Ce constructeur permet d'instancier une Case Constructible par défaut ne contenant pas de maison ou d'hôtel
     */    
    public Constructible(){
        
        super();
        this.maison = 0;
        this.hotel = false;
        
        
    }
    
    
    /**
     * Ce constructeur permet d'instancier une Case Constructible en précisant la valeur de chacun de ses attributs
     * @param nom le nom de la case
     * @param prix le prix de la case
     * @param proprio le propriétaire de la case
     * @param maison le nombre de maison sur la case
     * @param hotel la possibilité de construire un hôtel ou non
     */
    public Constructible(String nom, int prix, Joueur proprio, int maison, boolean hotel){
        
        super(nom, prix, proprio);
        this.maison = maison;
        this.hotel = hotel;
        
    }
    

    public int getMaison() {
        return maison;
    }

    public void setMaison(int maison) {
        this.maison = maison;
    }

    public boolean isHotel() {
        return hotel;
    }

    public void setHotel(boolean hotel) {
        this.hotel = hotel;
    }

}
