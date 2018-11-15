package com.monopoly;

import java.util.ArrayList;

public class Joueur {
    private String nom;
//    private String prenom;
    private int fortune = 100000;
    private int position;
    private Plateau refPlateau;
    private int nbGare;
    private ArrayList<Carte>;
    
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
        reuturn this.refPlateau;
    }
    
    public Case getCurrentCase(){
        return this.refPlateau.getCase(this.position);
    }
    public boolean estEnPrison(){
        Case currentCase = this.getCurrentCase();
        if(currentCase instanceof(AllerEnPrision)){
            this.enPrison = true;
        }
        else{
                this.enPrison = false;
        }
        return this.enPrison;
    }
    
    public static int lanceLeDe(){
        return ((int) Math.floor(Math.random()*6))+1;
    }
    
    public int getNbGare(){
        int nb_gare = 0;
        for(Case case : this.refPlateau.plateau){
            if(case instanceof Gare){
                nb_gare++;
            }
        }
        return nb_gare;
    }
    
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

    
    public void affiche(){
        // TODO:
        
    }
    
    
    
}

class NoMoreMoney extends Exception{
    public NoMoreMoney(String message){
        super(message);
    }
    public NoMoreMoney(){
        super("No more money!");
    }
    
