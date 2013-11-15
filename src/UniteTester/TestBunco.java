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
import ca.etsmtl.log121.lab3.bunco.Bunco;
import ca.etsmtl.log121.lab3.IStrategie;
import ca.etsmtl.log121.lab3.Jeux;
import ca.etsmtl.log121.lab3.Joueur;

public class TestBunco {
	
	int DEFAULT_PLAYER_NUMBER = 3;
	
	private class Strategie implements IStrategie<Integer>{
		
		public void initialiserJeux(Jeux<Integer> jeux){
		}
		
		public int calculerScoreTour(Jeux<Integer> jeux) {
			return 0;
		}

		@Override
		public Joueur[] calculerLeVainqueur(Jeux<Integer> jeux) {
			return null;
		}
	}
	
	@Test
	public void testBunco(){
		
		IStrategie<Integer> uneStrategie = new Strategie();
		Jeux<Integer> unJeux = new Jeux<Integer>(uneStrategie, DEFAULT_PLAYER_NUMBER);
		Bunco unBunco = new Bunco();
		unBunco.initialiserJeux(unJeux);
		
		assertTrue(unJeux.getDes().taille()==3);
		//assertTrue(unJeux.getDes().taille()< 4);
		//assertTrue(unJeux.getDes().taille()> 2);
		//assertFalse(unJeux.getDes().taille()> 4);
		//assertFalse(unJeux.getDes().taille()< 2);
		//assertFalse(unJeux.getDes().taille()!=3);
		assertTrue(unJeux.getJoueurs().taille() == 3);
	}
	
	@Test
	public void testcalculerLeVainqueur(){
		
		IStrategie<Integer> uneStrategie = new Strategie();
		Jeux<Integer> unJeux = new Jeux<Integer>(uneStrategie, DEFAULT_PLAYER_NUMBER);
		Bunco unBunco = new Bunco();
		unBunco.initialiserJeux(unJeux);
		
		
		Joueur joueur1= unJeux.getJoueurs().obtenirJoueur(0);
		joueur1.setPoints(250);
		assertTrue(joueur1.getPoints()==250);
		Joueur joueur2 = unJeux.getJoueurs().obtenirJoueur(1);
		joueur2.setPoints(50);
		Joueur joueur3 = unJeux.getJoueurs().obtenirJoueur(2);
		joueur3.setPoints(215);
		
		Joueur ordreGagnant[] = unBunco.calculerLeVainqueur(unJeux);
		assertTrue(ordreGagnant[0] == joueur1);
		assertTrue(ordreGagnant[1] == joueur3);
		assertTrue(ordreGagnant[2] == joueur2);
		
	}
	
	@Test
	public void calculerScoreTour(){
		IStrategie<Integer> uneStrategie = new Strategie();
		Jeux<Integer> unJeux = new Jeux<Integer>(uneStrategie,DEFAULT_PLAYER_NUMBER);
		Bunco unBunco = new Bunco();
		unBunco.initialiserJeux(unJeux);
		
		unJeux.getDes().obtenirDe(0).setValeur(1);
		unJeux.getDes().obtenirDe(1).setValeur(1);
		unJeux.getDes().obtenirDe(2).setValeur(1);
				
		unBunco.calculerScoreTour(unJeux);
		
		int leJoueur = unJeux.getJoueurs().obtenirJoueur(0).getPointsTours(1);
		
		assertTrue(leJoueur == 21);
	}
}
