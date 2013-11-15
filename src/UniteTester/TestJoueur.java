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

	private Joueur joueurTesteur;
	
	@Before
	public void faireAvant(){
		joueurTesteur = new Joueur();
	}
	
	@Test
	public void testJoueur() {
		assertEquals(0, joueurTesteur.getPoints());
		String[] numeroJoueur = (joueurTesteur.getNom()).split("r");
		joueurTesteur = new Joueur();
		assertEquals("Joueur"+(Integer.parseInt(numeroJoueur[1])+1), joueurTesteur.getNom());
	}

	@Test
	public void testJoueurString() {
		final String nomTest = "JoueurTesteur";
		joueurTesteur = new Joueur(nomTest);
		assertEquals(nomTest, joueurTesteur.getNom());
	}

	@Test
	public void testSetPoints() {
		final int pointsTest = 1;
		joueurTesteur.setPoints(pointsTest);
		assertEquals(pointsTest, joueurTesteur.getPoints());
	}

	@Test
	public void testSetNom() {
		final String nomTest = "LeJoueurTesteur";
		joueurTesteur.setNom(nomTest);
		assertEquals(nomTest, joueurTesteur.getNom());
	}

	@Test
	public void testSetPointsTours() {
		final int tour = 1;
		final int pointsTour = 2;
		joueurTesteur.setPointsTours(pointsTour);
		assertEquals(pointsTour, joueurTesteur.getPointsTours(tour));
	}

	@Test
	public void testCompareTo() {
		final int petitPoints = 1;
		final int grandPoints = 2;
		Joueur joueurTesteur2 = new Joueur();
		joueurTesteur.setPoints(petitPoints);
		joueurTesteur2.setPoints(grandPoints);
		assertEquals(-1, joueurTesteur.compareTo(joueurTesteur2));
	}

}
