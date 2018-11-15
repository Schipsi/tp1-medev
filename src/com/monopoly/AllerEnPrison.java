/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.monopoly;

/**
 *
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
   
    
}
