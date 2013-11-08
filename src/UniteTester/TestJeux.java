package UniteTester;

import static org.junit.Assert.*;

import org.junit.Test;

//import UniteTester.TestBunco.Strategie;
import ca.etsmtl.log121.lab3.IStrategie;

import ca.etsmtl.log121.lab3.*;

public class TestJeux {
	
	private static final int DEFAULT_SCORE_VALUE = 3456;
	private static final int DEFAULT_JOUEUR_COUNT = 5;

	private class TestJeuxStrategie implements IStrategie {

		public Joueur vainqueur;
		public Joueur[] vainqueurTab;
		
		public TestJeuxStrategie(Joueur vainqueur) {
			this.vainqueur = vainqueur;
		}
		
		@Override
		public void initialiserJeux(Jeux jeux) {
		}

		@Override
		public Joueur[] calculerLeVainqueur(Jeux jeux) {
			return vainqueurTab;
		}

		@Override
		public int calculerScoreTour(Jeux jeux) {
			return DEFAULT_SCORE_VALUE;
		}
		
	}
	
	private Joueur vainqueur;
	
	@Test
	public void TestJeux() {
		
		/**
		final Joueur unJoueur = new Joueur();
		final IStrategie uneStrategie = new TestJeuxStrategie(unJoueur);
		final Jeux jeuxTesteur = new Jeux(uneStrategie,DEFAULT_JOUEUR_COUNT);
		final Jeux jeuxTesteur2 = this.generateJeux();
		**/
		
		assertTrue(this.generateJeux().getJoueurs().taille() == DEFAULT_JOUEUR_COUNT);
		//vainqueur = new Joueur("vainqueur");
	}
	
	
	private Jeux generateJeux() {
		IStrategie strategie = new TestJeuxStrategie(vainqueur);
		return new Jeux(strategie, DEFAULT_JOUEUR_COUNT);
	}

	@Test
	public void testGetDes() {
		Jeux jeux = generateJeux();
		assertEquals("renvoie une CollectionDes", CollectionDes.class, jeux.getDes().getClass());
	}

	@Test
	public void testGetJoueurs() {
		Jeux jeux = generateJeux();
		assertEquals("renvoie une CollectionJoueurs", CollectionJoueurs.class, jeux.getJoueurs().getClass());
		assertEquals("Il y a le bon nombre de joueurs", DEFAULT_JOUEUR_COUNT + 1, jeux.getJoueurs().taille());
	}

	@Test
	public void testNbTours() {
		Jeux jeux = generateJeux();
		int nbTours;
		for(int i=0; i<2; i++) {
			nbTours = (int) Math.floor(Math.random()*30);
			jeux.setNbTours(nbTours);
			assertEquals(nbTours, jeux.getNbTours());
		}
	}

	@Test
	public void testTourCourant() {
		Jeux jeux = generateJeux();
		for(int tour=0; tour<5; tour++) {
			assertEquals(tour, jeux.getTourCourant());
			jeux.incrementeurTour();
		}
	}

	@Test
	public void testCalculerScoreTour() {
		Jeux jeux = generateJeux();
		assertEquals(DEFAULT_SCORE_VALUE, jeux.calculerScoreTour());
	}

	@Test
	public void testCalculerLeVainqueur() {
		Jeux jeux = generateJeux();
		assertEquals(vainqueur, jeux.calculerLeVainqueur());
	}

	@Test
	public void testBrasserDes() {
		Jeux jeux = generateJeux();
		jeux.brasserDes();
		fail("Not yet implemented");
	}

}
