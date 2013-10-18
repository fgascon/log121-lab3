package ca.etsmtl.log121.lab3.de;

import ca.etsmtl.log121.lab3.Iterateur;

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
