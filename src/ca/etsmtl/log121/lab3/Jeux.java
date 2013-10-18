package ca.etsmtl.log121.lab3;

import ca.etsmtl.log121.lab3.joueur.*;
import ca.etsmtl.log121.lab3.de.*;

public class Jeux {

	private final IStrategie typeDeJeux;
	private final CollectionDes des;
	private final CollectionJoueurs joueurs;

	private int nbTours;
	private int tourCourant;
	

	public Jeux(IStrategie typeDeJeux) {
		this.typeDeJeux = typeDeJeux;
		des = new CollectionDes();
		joueurs = new CollectionJoueurs();
		tourCourant = 0;
		typeDeJeux.initialiserJeux(this);
	}

	public CollectionDes getDes() {
		return des;
	}

	public CollectionJoueurs getJoueurs() {
		return joueurs;
	}
	
	public int getNbTours(){
		return this.nbTours;
	}
	
	public void setNbTours(int maxTours){
		this.nbTours = maxTours; 
	}
	
	public int getTourCourant(){
		return this.tourCourant;
	}
	
	public void incrementeurTour(){
		this.tourCourant++;
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
