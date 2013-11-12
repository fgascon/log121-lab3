/******************************************************
Cours:  LOG121
Projet: Laboratoire 3
Nom du fichier: CollectionJoueurs.java
Date cr��: 2013-10-25
 *******************************************************
Historique des modifications
 *******************************************************
 *@author Shaun-David Sauro, Gabriel St-Hilaire
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
		return null;
	}
	
	public Joueur[] toArray() {
		return (Joueur[]) list.toArray();
	}
}
