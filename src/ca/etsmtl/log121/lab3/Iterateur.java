/******************************************************
Cours:  LOG121
Projet: Laboratoire 3
Nom du fichier: Iterateur.java
Date cr��: 2013-10-25
 *******************************************************
Historique des modifications
 *******************************************************
 *@author Shaun-David Sauro, Gabriel St-Hilaire, Fr�d�ric Gascon
 *@date 2013-10-25
 *******************************************************/
package ca.etsmtl.log121.lab3;

public interface Iterateur<E> {

	public boolean hasNext();
	
	public E getNext();
}
