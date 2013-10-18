package ca.etsmtl.log121.lab3;

import ca.etsmtl.log121.lab3.joueur.*;
import ca.etsmtl.log121.lab3.de.*;

public class Jeux {

	private final IStrategie typeDeJeux;
	private final CollectionDe des;
	private final CollectionJoueur joueurs;

	private int nbTours;
	private int tourCourant;

	public Jeux(IStrategie typeDeJeux) {
		this.typeDeJeux = typeDeJeux;
		des = new CollectionDe();
		joueurs = new CollectionJoueur();
		tourCourant = 0;
		typeDeJeux.initialiserJeux(this);
	}

	public CollectionDe getDes() {
		return des;
	}

	public CollectionJoueur getJoueurs() {
		return joueurs;
	}

	public int calculerScoreTour() {
		return typeDeJeux.calculerScoreTour(this);
	}

	public Joueur calculerLeVainqueur() {
		return typeDeJeux.calculerLeVainqueur(this);
	}

	public void brasserDes(Joueur unJoueur) {
		IterateurDes iterateur = des.creerIterateur();
		De deCourant;
		while(iterateur.hasNext()) {
			deCourant = iterateur.getNext();
			deCourant.randomize();
		}
	}
}
