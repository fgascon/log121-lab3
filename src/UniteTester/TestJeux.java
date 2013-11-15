/******************************************************
Cours:  LOG121
Projet: Laboratoire 3
Nom du fichier: TestJeux.java
Date créé: 2013-10-25
 *******************************************************
Historique des modifications
 *******************************************************
 *@author Shaun-David Sauro, Gabriel St-Hilaire, Frédéric Gascon
 *@date 2013-10-25
 *******************************************************/
package UniteTester;

import static org.junit.Assert.*;

import org.junit.Test;

//import UniteTester.TestBunco.Strategie;
import ca.etsmtl.log121.lab3.IStrategie;

import ca.etsmtl.log121.lab3.*;

public class TestJeux {
	
	private static final int DEFAULT_SCORE_VALUE = 3456;
	private static final int DEFAULT_JOUEUR_COUNT = 5;

	private class TestJeuxStrategie implements IStrategie<Integer> {

		//public Joueur vainqueur;
		public Joueur[] vainqueurTab;
		
		public TestJeuxStrategie(Joueur vainqueur) {
			//a	this.vainqueur = vainqueur;
		}
		
		@Override
		public void initialiserJeux(Jeux<Integer> jeux) {
			//jeux.getJoueurs().ajouterJoueur(vainqueur);
		}

		@Override
		public Joueur[] calculerLeVainqueur(Jeux<Integer> jeux) {
			return vainqueurTab;
		}

		@Override
		public int calculerScoreTour(Jeux<Integer> jeux) {
			return DEFAULT_SCORE_VALUE;
		}
		
	}
	
	private Joueur vainqueur;
	
	@Test
	public void TestdeJeux() {
		
		/**
		final Joueur unJoueur = new Joueur();
		final IStrategie uneStrategie = new TestJeuxStrategie(unJoueur);
		final Jeux jeuxTesteur = new Jeux(uneStrategie,DEFAULT_JOUEUR_COUNT);
		final Jeux jeuxTesteur2 = this.generateJeux();
		**/
		
		assertTrue(this.generateJeux().getJoueurs().taille() == DEFAULT_JOUEUR_COUNT);
		//vainqueur = new Joueur("vainqueur");
	}
	
	
	private Jeux<Integer> generateJeux() {
		IStrategie<Integer> strategie = new TestJeuxStrategie(vainqueur);
		return new Jeux<Integer>(strategie, DEFAULT_JOUEUR_COUNT);
	}

	@Test
	public void testGetDes() {
		Jeux<Integer> jeux = generateJeux();
		assertEquals("renvoie une CollectionDes", CollectionDes.class, jeux.getDes().getClass());
	}

	@Test
	public void testGetJoueurs() {
		Jeux<Integer> jeux = generateJeux();
		assertEquals("renvoie une CollectionJoueurs", CollectionJoueurs.class, jeux.getJoueurs().getClass());
		assertEquals("Il y a le bon nombre de joueurs", DEFAULT_JOUEUR_COUNT, jeux.getJoueurs().taille());
	}

	@Test
	public void testNbTours() {
		Jeux<Integer> jeux = generateJeux();
		int nbTours;
		for(int i=0; i<2; i++) {
			nbTours = (int) Math.floor(Math.random()*30);
			jeux.setNbTours(nbTours);
			assertEquals(nbTours, jeux.getNbTours());
		}
	}

	@Test
	public void testTourCourant() {
		Jeux<Integer> jeux = generateJeux();
		for(int tour=0; tour>5; tour++) {
			assertEquals(tour, jeux.getTourCourant());
			jeux.incrementeurTour();
		}
	}

	@Test
	public void testCalculerScoreTour() {
		Jeux<Integer> jeux = generateJeux();
		assertEquals(DEFAULT_SCORE_VALUE, jeux.calculerScoreTour());
	}

	@Test
	public void testCalculerLeVainqueur() {
		Jeux<Integer> jeux = generateJeux();
		assertEquals(vainqueur, jeux.calculerLeVainqueur());
	}

	@Test
	public void testBrasserDes() {
		Integer[] listeFaces = {1,2,3,4,5,6};
		De<Integer> unDe = new De<Integer>(listeFaces);
		Jeux<Integer> jeux = generateJeux();
		jeux.getDes().ajouterDe(unDe);
		jeux.brasserDes(); 
		jeux.getDes().obtenirDe(0).getValeur();
		
		assertTrue((Integer)jeux.getDes().obtenirDe(0).getValeur() != 0);
		assertTrue(jeux.getDes().taille() != 0);
	}

}
