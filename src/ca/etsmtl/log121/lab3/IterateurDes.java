/******************************************************
Cours:  LOG121
Projet: Laboratoire 3
Nom du fichier: IterateurDes.java
Date cr��: 2013-10-25
 *******************************************************
Historique des modifications
 *******************************************************
 *@author Shaun-David Sauro, Gabriel St-Hilaire, Fr�d�ric Gascon
 *@date 2013-10-25
 *******************************************************/
package ca.etsmtl.log121.lab3;


public class IterateurDes implements Iterateur<De> {

	private final CollectionDes collection;
	private int courant;

	public IterateurDes(CollectionDes collection) {
		this.collection = collection;
		courant = 0;
	}

	@Override
	public boolean hasNext() {
		return courant < collection.taille();
	}

	@Override
	public De getNext() {
		return collection.obtenirDe(courant++);
	}
	
}
