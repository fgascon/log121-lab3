package ca.etsmtl.log121.lab3;

import ca.etsmtl.log121.lab3.joueur.*;
import ca.etsmtl.log121.lab3.de.*;

public class Jeux {

	private int nbTours;
	private int tourCourant;
	private IStrategie typeDeJeux;
	private CollectionDe des;
	private CollectionJoueur joueurs;

	public Jeux(IStrategie typeDeJeux) {
		this.typeDeJeux = typeDeJeux;
		des = new CollectionDe();
		typeDeJeux.initialiserJeux(this);
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
