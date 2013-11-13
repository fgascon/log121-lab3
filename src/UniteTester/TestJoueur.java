/******************************************************
Cours:  LOG121
Projet: Laboratoire 3
Nom du fichier: TestJoueur.java
Date créé: 2013-10-25
 *******************************************************
Historique des modifications
 *******************************************************
 *@author Shaun-David Sauro, Gabriel St-Hilaire, Frédéric Gascon
 *@date 2013-10-25
 *******************************************************/
package UniteTester;

import static org.junit.Assert.*;

import ca.etsmtl.log121.lab3.Joueur;

import org.junit.*;

public class TestJoueur {

	private Joueur JoueurTesteur;
	
	@Before
	public void faireAvant(){
		JoueurTesteur = new Joueur();
	}
	
	@Test
	public void testJoueur() {
		assertEquals(0, JoueurTesteur.getPoints());
		String[] numeroJoueur = (JoueurTesteur.getNom()).split("r");
		JoueurTesteur = new Joueur();
		assertEquals("Joueur"+(Integer.parseInt(numeroJoueur[1])+1), JoueurTesteur.getNom());
	}

	@Test
	public void testJoueurString() {
		final String nomTest = "JoueurTesteur";
		JoueurTesteur = new Joueur(nomTest);
		assertEquals(nomTest, JoueurTesteur.getNom());
	}

	@Test
	public void testSetPoints() {
		final int pointsTest = 1;
		JoueurTesteur.setPoints(pointsTest);
		assertEquals(pointsTest, JoueurTesteur.getPoints());
	}

	@Test
	public void testSetNom() {
		final String nomTest = "LeJoueurTesteur";
		JoueurTesteur.setNom(nomTest);
		assertEquals(nomTest, JoueurTesteur.getNom());
	}

	@Test
	public void testSetPointsTours() {
		final int Tour = 1;
		final int pointsTour = 2;
		JoueurTesteur.setPointsTours(pointsTour);
		assertEquals(pointsTour, JoueurTesteur.getPointsTours(Tour));
	}

	@Test
	public void testCompareTo() {
		final int petitPoints = 1;
		final int grandPoints = 2;
		Joueur JoueurTesteur2 = new Joueur();
		JoueurTesteur.setPoints(petitPoints);
		JoueurTesteur2.setPoints(grandPoints);
		assertEquals(-1, JoueurTesteur.compareTo(JoueurTesteur2));
	}

}
