package ca.etsmtl.log121.lab3;


public class IterateurJoueur implements Iterateur<Joueur> {

	private final CollectionJoueurs collection;
	private int courant;
	
	public IterateurJoueur(CollectionJoueurs collection) {
		this.collection = collection;
		courant = 0;
	}
	
	@Override
	public boolean hasNext() {
		return courant < collection.taille();
	}

	@Override
	public Joueur getNext() {
		return collection.obtenirJoueur(courant++);
	}

}