/******************************************************
Cours:  LOG121
Projet: Laboratoire 3
Nom du fichier: Jeux.java
Date créé: 2013-10-25
 *******************************************************
Historique des modifications
 *******************************************************
 *@author Shaun-David Sauro, Gabriel St-Hilaire
 *@date 2013-10-25
 *******************************************************/
package ca.etsmtl.log121.lab3;

public class Jeux {

	private final IStrategie typeDeJeux;
	private final CollectionDes des;
	private final CollectionJoueurs joueurs;

	private int nbTours;
	private int tourCourant;
	private Iterateur<Joueur> joueurCourant;

	public Jeux(IStrategie typeDeJeux, int nbJoueurs) {
		this(typeDeJeux);
		for(int i=0; i<nbJoueurs; i++) {
			joueurs.ajouterJoueur(new Joueur());
		}
	}

	public Jeux(IStrategie typeDeJeux, String[] nomsJoueurs) {
		this(typeDeJeux);
		for(int i=0; i<nomsJoueurs.length; i++) {
			joueurs.ajouterJoueur(new Joueur(nomsJoueurs[i]));
		}
	}

	public Jeux(IStrategie typeDeJeux) {
		this.typeDeJeux = typeDeJeux;
		des = new CollectionDes();
		joueurs = new CollectionJoueurs();
		tourCourant = 1;
		joueurCourant = joueurs.creerIterateur();
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
		this.joueurCourant = joueurs.creerIterateur();
	}
	
	public Iterateur<Joueur> getJoueurCourant() {
		return joueurCourant;
	}
	
	public int calculerScoreTour() {
		return typeDeJeux.calculerScoreTour(this);
	}
	
	public Joueur[] calculerLeVainqueur() {
		return typeDeJeux.calculerLeVainqueur(this);
	}
	
	public void brasserDes() {
		IterateurDes iterateur = des.creerIterateur();
		De deCourant;
		while(iterateur.hasNext()) {
			deCourant = iterateur.getNext();
			deCourant.randomize();
		}
	}
}
