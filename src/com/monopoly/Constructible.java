/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

/**
 * Cette classe représente les cases sur lesquelles on peut construire des
 * maisons et hôtels
 *
 * @author Saadate
 */
public class Constructible extends CaseAchetable {

    /**
     * Cet attribut représente le nombre de maisons sur la case
     */
    public int maison;

    /**
     * Cet attribut représente la possibilité de construire un (unique) hôtel
     * sur la case
     */
    public boolean hotel;

    /**
     * Cet attribut représente le loyer à payer par maison construite
     */
    public static final int A = 10;

    /**
     * Cet attribut représente le loyer à payer par hôtel construit
     */
    public static final int B = 100;

    /**
     * Cet attribut représente le loyer par défault lorsqu'il n'y a ni maison ni
     * hôtel
     */
    public static final int LOYERDEFAULT = 5;

    /**
     * Ce constructeur permet d'instancier une Case Constructible par défaut ne
     * contenant pas de maison ou d'hôtel
     */
    public Constructible() {

        super();
        this.maison = 0;
        this.hotel = false;

    }

    /**
     * Ce constructeur permet d'instancier une Case Constructible en précisant
     * la valeur de chacun de ses attributs
     *
     * @param nom le nom de la case
     * @param prix le prix de la case
     * @param proprio le propriétaire de la case
     * @param maison le nombre de maison sur la case
     * @param hotel la possibilité de construire un hôtel ou non
     */
    public Constructible(String nom, int prix, Joueur proprio, int maison, boolean hotel) {

        super(nom, prix, proprio);
        this.maison = maison;
        this.hotel = hotel;

    }

    /**
     * Cette méthode donne le loyer de la case
     *
     * @return retourne le loyer de la case
     */
    public int loyer() {

        if (this.getJoueur() == null) {
            return 0;

        } else {

            if (this.maison == 0 && !this.hotel) {
                return LOYERDEFAULT;

            } else {
                return B * this.hotel + A * this.maison;
            }
        }

    }

    /**
     * Cette méthode permet à un Joueur d'acheter la case si elle n'a pas de
     * propriétaire
     *
     * @param j le Joueur qui veut acheter la case
     */
    public void acheter(Joueur j) {

        if (this.getJoueur() == null && j.getFortune() >= this.getPrix()) {

            this.setJoueur(j);
            System.out.print("Le joueur ");
            System.out.print(j.getNom());
            System.out.print(" a acheté la case ");
            System.out.println(this.getNom());

            j.setFortune(j.getFortune() - this.getPrix());

        } else if (this.getJoueur() == null && j.getFortune() < this.getPrix()) {

            System.out.println("Pas assez d'argent");

        } else {

            System.out.println("Déjà un propriétaire");

        }

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
