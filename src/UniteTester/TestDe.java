/******************************************************
Cours:  LOG121
Projet: Laboratoire 3
Nom du fichier: FenetreFormes.java
Date créé: 2013-10-25
 *******************************************************
Historique des modifications
 *******************************************************
 *@author Shaun-David Sauro, Gabriel St-Hilaire
 *@date 2013-10-25
 *******************************************************/
package UniteTester;

import org.junit.Test;

import static org.junit.Assert.*;

import ca.etsmtl.log121.lab3.De;

public class TestDe {

	@Test
	public void testUnDe(){
		
		De unDe = new De();
		assertTrue(unDe.getNbDeFaces() != 0);
	
	}
	
	@Test
	public void testUnDeParam(){
		Integer[] listeFaces = {1,2,3,4,5,6,7,8,9,10};
		De unDe = new De(listeFaces);
		assertTrue(unDe.getNbDeFaces() != 0);
	}
	
	@Test
	public void testUnDeDeuxParam(){
		Integer[] listeFaces = {1,2,3,4,5,6,7,8,9,10};
		De unDe = new De(listeFaces,5);
		assertTrue(unDe.getNbDeFaces() != 0);
		assertTrue(unDe.getValeur() != null);
	}
	
	@Test
	public void testRandomize(){
		Integer[] listeFaces = {1,2};
		De unDe = new De(listeFaces);
		unDe.randomize();
		int valeure = (Integer) unDe.getValeur();
		assertTrue( valeure > 0);
		assertTrue( valeure < unDe.getNbDeFaces()+1);
		assertTrue( valeure < 3);
	}
	
	@Test
	public void testGetValeur(){
		Integer[] liste = {1,2,3,4,5,6};
		De unDe = new De(liste,3);
		assertTrue( (Integer) unDe.getValeur()== 3);
	}
	
	@Test
	public void testSetValeur(){
		Integer uneValeure = 5;
		De unDe = new De();
		assertFalse(unDe.getValeur() != null);
		unDe.setValeur(uneValeure);
		assertTrue( (Integer) unDe.getValeur() == 5);
	}
	
	@Test
	public void testGetNbDeFaces(){
		De unDe = new De();
		assertTrue(unDe.getNbDeFaces() == 6);
	}
	
	
}
