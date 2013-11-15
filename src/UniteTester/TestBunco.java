/******************************************************
Cours:  LOG121
Projet: Laboratoire 3
Nom du fichier: TestBunco.java
Date créé: 2013-10-25
 *******************************************************
Historique des modifications
 *******************************************************
 *@author Shaun-David Sauro, Gabriel St-Hilaire, Frédéric Gascon
 *@date 2013-10-25
 *******************************************************/
package UniteTester;

import org.junit.Test;

import static org.junit.Assert.*;
import ca.etsmtl.log121.lab3.bunco.BuncoFactory;
import ca.etsmtl.log121.lab3.Jeux;
import ca.etsmtl.log121.lab3.Joueur;

public class TestBunco {
	
	int DEFAULT_PLAYER_NUMBER = 3;
	
	private Jeux<Integer> generateBunco(){
		BuncoFactory buncoFactory = new BuncoFactory();
		return buncoFactory.generateJeux(DEFAULT_PLAYER_NUMBER);
	}
	
	@Test
	public void testBunco(){
		Jeux<Integer> unJeux = generateBunco();
		
		assertTrue(unJeux.getDes().taille() == 3);
		assertTrue(unJeux.getJoueurs().taille() == 3);
	}
	
	@Test
	public void testcalculerLeVainqueur(){
		Jeux<Integer> unJeux = generateBunco();
		
		Joueur joueur1= unJeux.getJoueurs().obtenirJoueur(0);
		joueur1.setPoints(250);
		assertTrue(joueur1.getPoints()==250);
		Joueur joueur2 = unJeux.getJoueurs().obtenirJoueur(1);
		joueur2.setPoints(50);
		Joueur joueur3 = unJeux.getJoueurs().obtenirJoueur(2);
		joueur3.setPoints(215);
		
		Joueur ordreGagnant[] = unJeux.calculerLeVainqueur();
		assertTrue(ordreGagnant[0] == joueur1);
		assertTrue(ordreGagnant[1] == joueur3);
		assertTrue(ordreGagnant[2] == joueur2);
	}
	
	@Test
	public void calculerScoreTour(){
		Jeux<Integer> unJeux = generateBunco();
		
		unJeux.getDes().obtenirDe(0).setValeur(1);
		unJeux.getDes().obtenirDe(1).setValeur(1);
		unJeux.getDes().obtenirDe(2).setValeur(1);
		
		unJeux.calculerScoreTour();
		
		int leJoueur = unJeux.getJoueurs().obtenirJoueur(0).getPointsTours(1);
		
		assertTrue(leJoueur == 21);
	}
}
