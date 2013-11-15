/******************************************************
Cours:  LOG121
Projet: Laboratoire 3
Nom du fichier: FenetreFormes.java
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

import ca.etsmtl.log121.lab3.De;

public class TestDe {
	
	@Test
	public void testUnDeParam(){
		Integer[] listeFaces = {1,2,3,4,5,6,7,8,9,10};
		De<Integer> unDe = new De<Integer>(listeFaces);
		assertTrue(unDe.getNbDeFaces() != 0);
	}
	
	@Test
	public void testUnDeDeuxParam(){
		Integer[] listeFaces = {1,2,3,4,5,6,7,8,9,10};
		De<Integer> unDe = new De<Integer>(listeFaces, 5);
		assertTrue(unDe.getNbDeFaces() != 0);
		assertTrue(unDe.getValeur() != null);
	}
	
	@Test
	public void testRandomize(){
		Integer[] listeFaces = {1,2};
		De<Integer> unDe = new De<Integer>(listeFaces);
		unDe.randomize();
		int valeure = (Integer) unDe.getValeur();
		assertTrue( valeure > 0);
		assertTrue( valeure < unDe.getNbDeFaces()+1);
		assertTrue( valeure < 3);
	}
	
	@Test
	public void testGetValeur(){
		Integer[] liste = {1,2,3,4,5,6};
		De<Integer> unDe = new De<Integer>(liste,3);
		assertTrue( (Integer) unDe.getValeur()== 3);
	}
	
	@Test
	public void testSetValeur(){
		Integer uneValeure = 5;
		Integer[] listeFaces = {1,2,3,4,5,6};
		De<Integer> unDe = new De<Integer>(listeFaces);
		assertFalse(unDe.getValeur() != null);
		unDe.setValeur(uneValeure);
		assertTrue( (Integer) unDe.getValeur() == 5);
	}
	
	@Test
	public void testGetNbDeFaces(){
		Integer[] listeFaces = {1,2,3,4,5,6};
		De<Integer> unDe = new De<Integer>(listeFaces);
		assertTrue(unDe.getNbDeFaces() == 6);
	}
	
	public void testComparable(){
		Integer[] listeFaces = {1,2,3,4,5,6};
		De<Integer> reference = new De<Integer>(listeFaces, 4);
		De<Integer> same = new De<Integer>(listeFaces, 4);
		De<Integer> bigger = new De<Integer>(listeFaces, 5);
		De<Integer> smaller = new De<Integer>(listeFaces, 3);
		assertEquals(0, reference.compareTo(same));
		assertEquals(1, reference.compareTo(bigger));
		assertEquals(-1, reference.compareTo(smaller));
	}
}
