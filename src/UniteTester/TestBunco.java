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
	public Joueur[] calculerLeVainqueur(Jeux jeux){
		Bunco unBunco = new Bunco();
		unBunco.initialiserJeux(jeux);
	}**/
	
}
