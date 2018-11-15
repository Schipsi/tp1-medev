/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.monopoly;

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
