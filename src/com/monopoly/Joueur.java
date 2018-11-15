package com.monopoly;

import java.util.ArrayList;
/**
 * Class Joueur
 * @author Exia
 */
public class Joueur {
    private String nom;
//    private String prenom;
    private int fortune = 100000;
    private int position;
    private Plateau refPlateau;
    private int nbGare;
    private ArrayList<Carte> cartes;
    
    private boolean enPrison;
    public Joueur(String nom, int position){
        this.nom = nom;
        this.position = position;
    }
    public Joueur(Joueur joueur){
        this.nom = joueur.nom;
        this.fortune = joueur.fortune;
        this.position = joueur.position;
    }
    public Joueur(){
        
    }
    
    public void setNom(String nom){
        this.nom = nom;
    }
    public void setFortune(int fortune){
        this.fortune = fortune;
    }
    public void setPosition(int pos){
        this.position = pos;
    }
    public void setPlateau(Plateau plateau){
        this.refPlateau = plateau;
        
    }
    public String getNom(){
        return this.nom;
    }
    public int getFortune(){
        return fortune;
    }
    public int getPosition(){
        return position;
    }
    public Plateau getRefPlateau(){
        return this.refPlateau;
    }
    public ArrayList<Carte> getCartes(){
        return this.cartes;
    }
    
    public Case getCurrentCase(){
        return this.refPlateau.getCase(this.position);
    }
    public boolean estEnPrison(){
        Case currentCase = this.getCurrentCase();
        if(currentCase instanceof Prison){
            this.enPrison = true;
        }
        else{
                this.enPrison = false;
        }
        return this.enPrison;
    }
    
    /**
     * 
     * @return renvoyer le nombre aleatoire entre 1 et 6
     */
    public static int lanceLeDe(){
        return ((int) Math.floor(Math.random()*6))+1;
    }
    
    /**
     * 
     * @return  renoyer le nombre de gare de cette joueur.
     */
    public int getNbGare(){
        int nbGare = 0;
        for(Case mycase : this.refPlateau.plateau){
            if(mycase instanceof Gare){
                if(((Gare) mycase).getProprietaire().equals(this.nom)){
                    nbGare++;
                }
            }
        }
        return nbGare;
    }
    
    /**
     * 
     * @param somme l'argent que joueur veut payer
     * @param joueur le joeur qui va accepter cette somme.
     * @throws NoMoreMoney si somme>fortune, il ne peut pas payer.
     */
    public void payerJoueur(int somme, Joueur joueur) throws NoMoreMoney{
        // throw exception NoMoreMoney
        try {
            if(somme>this.fortune){
                throw new NoMoreMoney();
            }
            else{
                this.fortune -= somme;
                joueur.fortune += somme;
            }
        }catch(NoMoreMoney e){
            e.getMessage();
        }
                
    }  
}
/**
 * Class NoMoreMoney est une classe qui herite de Exception
 * @author Exia
 */
class NoMoreMoney extends Exception{
    public NoMoreMoney(String message){
        super(message);
    }
    public NoMoreMoney(){
        super("No more money!");
    }
}
    
