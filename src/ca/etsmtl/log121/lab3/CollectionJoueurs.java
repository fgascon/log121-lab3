/******************************************************
Cours:  LOG121
Projet: Laboratoire 3
Nom du fichier: CollectionJoueurs.java
Date créé: 2013-10-25
 *******************************************************
Historique des modifications
 *******************************************************
 *@author Shaun-David Sauro, Gabriel St-Hilaire, Frédéric Gascon
 *@date 2013-10-25
 *******************************************************/
package ca.etsmtl.log121.lab3;

import java.util.ArrayList;


public class CollectionJoueurs implements Iterable<Joueur> {

	private ArrayList<Joueur> list;

	public CollectionJoueurs() {
		list = new ArrayList<Joueur>();
	}

	public void ajouterJoueur(Joueur joueur) {
		list.add(joueur);
	}
	
	public int taille() {
		return list.size();
	}
	
	public Joueur obtenirJoueur(int index) {
		return list.get(index);
	}

	@Override
	public IterateurJoueur creerIterateur() {
		IterateurJoueur unIterateur = new IterateurJoueur(this);
		return unIterateur;
	}
	
	public Joueur[] toArray() {
		return  list.toArray(new Joueur[this.taille()]);
	}
}
