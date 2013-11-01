package ca.etsmtl.log121.lab3;

public class Jeux {

	private final IStrategie typeDeJeux;
	private final CollectionDes des;
	private final CollectionJoueurs joueurs;

	private int nbTours;
	private int tourCourant;
	private Joueur joueurCourant;

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

	private Jeux(IStrategie typeDeJeux) {
		this.typeDeJeux = typeDeJeux;
		des = new CollectionDes();
		joueurs = new CollectionJoueurs();
		tourCourant = 0;
		joueurCourant = null;
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
	
	public Joueur getJoueurCourant() {
		return joueurCourant;
	}
	
	public void setJoueurCourant(Joueur joueurCourant) {
		this.joueurCourant = joueurCourant;
	}
	
	public int calculerScoreTour() {
		return typeDeJeux.calculerScoreTour(this);
	}
	
	public Joueur calculerLeVainqueur() {
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
