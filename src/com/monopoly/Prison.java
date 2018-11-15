package com.monopoly;

/**
 * Represente une prison où sont incarcérés dans les joueurs
 * @author ouissal ait rholofo
 */
public abstract class Prison extends CaseNonAchetable {
    
     /**
     *prix pour sortir de prison
     */

    private int prixSortie;

    /**
     *
     * @return
     */
    public int getPrixSortie() {
        return prixSortie;
    }

    /**
     *
     * @param prixSortie
     */
    public void setPrixSortie(int prixSortie) {
        this.prixSortie = prixSortie;
    }

    /**
     *
     */
    public Prison() {
        super("Prison");
        prixSortie = 50;
    }

    /**
     * sortir le joueur de prison soit via una carte sortir de prison ou si sa fortune est supérieure au prix
     */
    /*
    public void action(Joueur j) {
        if (j.getPrison() == true) {
            if (j.getCartes().size() >= 1) {
                j.setEnPrison(false);
                LinkedList<Carte> cartes = j.getCartes();
                cartes.remove();
            }
            else {
                
                if (j.getFortune() >= prixSortie)
                {
                j.setEnPrison(false);
                j.setFortune(j.setFortume()-prixSortie);
                }
            }

        }

    }
    */
    
    public String toString(){
        String res= this.getClass().getName()+ " " + this.getNom();
        return res;
    }
    
}
