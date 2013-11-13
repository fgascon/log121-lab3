/******************************************************
Cours:  LOG121
Projet: Laboratoire 3
Nom du fichier: IterateurJoueur.java
Date créé: 2013-10-25
 *******************************************************
Historique des modifications
 *******************************************************
 *@author Shaun-David Sauro, Gabriel St-Hilaire, Frédéric Gascon
 *@date 2013-10-25
 *******************************************************/
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
