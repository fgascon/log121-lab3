package ca.etsmtl.log121.lab3.joueur;

import java.util.ArrayList;

import ca.etsmtl.log121.lab3.Iterable;

public class CollectionJoueurs implements Iterable<Joueur> {

	private ArrayList<Joueur> list;

	public CollectionJoueurs() {
		list = new ArrayList<Joueur>();
	}

	public void ajouterJoueur(Joueur joueur) {
		list.add(joueur);
	}

	@Override
	public IterateurJoueur creerIterateur() {
		// TODO Auto-generated method stub
		return null;
	}

}
