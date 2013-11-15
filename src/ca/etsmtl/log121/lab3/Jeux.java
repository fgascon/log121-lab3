/******************************************************
Cours:  LOG121
Projet: Laboratoire 3
Nom du fichier: Jeux.java
Date créé: 2013-10-25
 *******************************************************
Historique des modifications
 *******************************************************
 *@author Shaun-David Sauro, Gabriel St-Hilaire, Frédéric Gascon
 *@date 2013-10-25
 *******************************************************/
package ca.etsmtl.log121.lab3;

public class Jeux<Type extends Comparable<Type>> {

	private final IStrategie<Type> typeDeJeux;
	private final CollectionDes<Type> des;
	private final CollectionJoueurs joueurs;

	private int nbTours;
	private int tourCourant;
	private Iterateur<Joueur> joueurCourant;

	public Jeux(IStrategie<Type> typeDeJeux, DeFactory<Type> desFactory, int nbJoueurs) {
		this(typeDeJeux, desFactory);
		for(int i=0; i<nbJoueurs; i++) {
			joueurs.ajouterJoueur(new Joueur());
		}
	}

	public Jeux(IStrategie<Type> typeDeJeux, DeFactory<Type> desFactory, String[] nomsJoueurs) {
		this(typeDeJeux, desFactory);
		for(int i=0; i<nomsJoueurs.length; i++) {
			joueurs.ajouterJoueur(new Joueur(nomsJoueurs[i]));
		}
	}

	public Jeux(IStrategie<Type> typeDeJeux, DeFactory<Type> desFactory) {
		this.typeDeJeux = typeDeJeux;
		this.des = desFactory.generateDes();
		joueurs = new CollectionJoueurs();
		tourCourant = 1;
		joueurCourant = joueurs.creerIterateur();
	}

	public CollectionDes<Type> getDes() {
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
		IterateurDes<Type> iterateur = des.creerIterateur();
		while(iterateur.hasNext()) {
			iterateur.getNext().randomize();
		}
	}
}
