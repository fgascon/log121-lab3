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

public class IterateurDes<Type extends Comparable<Type>> implements Iterateur<De<Type>> {

	private final CollectionDes<Type> collection;
	private int courant;

	public IterateurDes(CollectionDes<Type> collection) {
		this.collection = collection;
		courant = 0;
	}

	@Override
	public boolean hasNext() {
		return courant < collection.taille();
	}

	@Override
	public De<Type> getNext() {
		return collection.obtenirDe(courant++);
	}
}
