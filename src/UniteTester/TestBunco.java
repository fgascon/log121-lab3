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
	
	private class Strategie implements IStrategie{
		public Joueur vainqueur;
		
		public Strategie(Joueur unVainqueur){
			vainqueur = unVainqueur;
		}
		
		public void initialiserJeux(Jeux jeux){
			}
		
		public int calculerScoreTour(Jeux jeux) {
			return 0;
		}

		@Override
		public Joueur[] calculerLeVainqueur(Jeux jeux) {
			// TODO Auto-generated method stub
			return null;
		}
	}
	
	@Test
	public void testBunco(){
		
		Joueur unJoueur = new Joueur();
		IStrategie uneStrategie = new Strategie(unJoueur);
		Jeux unJeux = new Jeux(uneStrategie,DEFAULT_PLAYER_NUMBER);
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
	/**
	@Test
	public void testcalculerLeVainqueur(){
		
		Joueur unJoueur = new Joueur();
		IStrategie uneStrategie = new Strategie(unJoueur);
		Jeux unJeux = new Jeux(uneStrategie,DEFAULT_PLAYER_NUMBER);
		Bunco unBunco = new Bunco();
<<<<<<< HEAD
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
=======
		unBunco.initialiserJeux(jeux);
	}**/
>>>>>>> d22db3659f866cd774632a29d691bb1f27bb225d
	
}
