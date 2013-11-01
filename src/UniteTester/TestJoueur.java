package UniteTester;

import static org.junit.Assert.*;

import org.junit.Test;

import ca.etsmtl.log121.lab3.Joueur;

public class TestJoueur {

	private Joueur JoueurTesteur;
	
	@Test
	public void testJoueur() {
		JoueurTesteur = new Joueur();
		//assertTrue("Les points valent 0", JoueurTesteur.getPoints() == 0);
		assertEquals(0, JoueurTesteur.getPoints());
		assertEquals("Joueur1", JoueurTesteur.getNom());
		//fail("Not yet implemented");
	}

	@Test
	public void testJoueurString() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetPoints() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPoints() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetNom() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetNom() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetPointsTours() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPointsTours() {
		fail("Not yet implemented");
	}

	@Test
	public void testCompareTo() {
		fail("Not yet implemented");
	}

}
