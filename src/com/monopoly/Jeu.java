/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.monopoly;
import java.util.Scanner;

/**
 * Classe définissant le déroulement du jeu de Monopoly.
 * @author antoinehurard
 */
public class Jeu {

    private static Plateau partie;

    public static void main (String[] args) {
        partie = new Plateau();
        partie.initPlateau();
        tourDeJeu();
    }

    /**
     * Effectue un jet aléatoire de dé 6.
     * @return la valeur du dé.
     */
    public static int lancerLeDe()
    {
        return ((int)Math.floor(Math.random()*6))+1;
    }

    /**
     * Effectue un tour de jeu de tous les joueurs.
     */
    public static void tourDeJeu()
    {
        Scanner sc = new Scanner(System.in);

        partie.joueurs.forEach((j) -> {

            if(j != null)
            {
                String nom = j.getNom();
                System.out.println("Tour de jeu de : " + nom);
                if(j.estEnPrison())
                {
                    System.out.println(nom + " est en prison.");
                    j.affiche();
                    System.out.println("Voulez-vous payer 1500 pour sortir de prison?");
                    String action = "";
                    while(!"o".equals(action) && !"n".equals(action))
                    {
                        System.out.println("Oui (o) / Non (n)");
                    }
                    if(action.equals("o"))
                    {
                        j.setFortune(j.getFortune() + -1500);
                    }
                    else
                    {
                        System.out.println(nom + " reste en prison pour ce tour.");
                    }

                }
                else
                {
                    int d = lancerLeDe();
                    int position = j.getPosition();
                    Case c = partie.plateau.get(position);
                    c = partie.avance(c, d);
                    if(position + d >= 40)
                    {
                        j.setFortune(j.getFortune() + 1500);
                        System.out.println(nom + " gagne 1500 en passant par la case départ.");
                    }

                    System.out.println("Le joueur " + nom + " est en " + j.getPosition());

                    if(c instanceof CaseNonAchetable)
                    {
                        ((CaseNonAchetable)c).action(j);
                    }
                    else
                    {
                        if(((CaseAchetable)c).getProprietaire() == null)
                        {
                            int prix = ((CaseAchetable) c).getPrix();
                            System.out.println(nom + " peut acheter la case " + c.getNom()
                                    + " pour " + prix);
                            System.out.println("Voulez-vous payer 1500 pour sortir de prison?");
                            String action = "";
                            j.affiche();
                            while (!"o".equals(action) && !"n".equals(action)) {
                                System.out.println("Oui (o) / Non (n)");
                            }
                            if (action.equals("o")) {
                                if(j.getFortune() >= prix)
                                {
                                    System.out.println("Achat effectué");
                                    j.setFortune(j.getFortune() + -prix);
                                }
                                else
                                {
                                    System.out.println("Pas assez de fond.");
                                }
                            } else {
                                System.out.println("Achat non effectué.");
                            }
                        }
                        else
                        {
                            j.payer(((CaseAchetable)c).getProprietaire(),((CaseAchetable)c).loyer());
                        }
                    }

                }
                System.out.println("Fin du tour de j.");
            }
        });

        if(finDePartie())
        {
            System.exit(0);
        }
        else
        {
            tourDeJeu();
        }
    }

    /**
     * Met fin à la partie dès qu'il n'y a plus qu'un joueur.
     * Quitte l'application.
     */
    public static boolean finDePartie()
    {
        if(partie.joueurs.size() > 1)
        {
            return false;
        }
        else
        {
            System.out.println("Fin de partie.");
            System.out.println(partie.joueurs.get(0).getNom() + " a gagné.");
            return true;
        }
    }

}
