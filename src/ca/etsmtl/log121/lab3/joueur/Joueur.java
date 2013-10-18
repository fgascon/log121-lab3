package ca.etsmtl.log121.lab3.joueur;

public class Joueur implements Comparable<Joueur> {
	
	private String nom;
	private int points;
	private int[] pointsTours;
	
	public Joueur(){
		this.nom = ("Joueur" + String.valueOf(Math.floor(Math.random()) ));
		this.points = 0;
	}
	
	public Joueur(String unNom){
		this.nom = unNom;
		this.points = 0;
	}
	
	public void setPoints(int desPoints){
		this.points = desPoints;
	}
	
	public int getPoints(){
		return this.points;
	}
	
	public void setNom(String unNom){
		this.nom = unNom;
	}
	
	public String getNom(){
		return this.nom;
	}
	
	public void setPointsTours(int unTour, int desPoints){
		this.pointsTours[unTour] = desPoints;
	}
	
	public int getPointsTours(int unTour){
		return this.pointsTours[unTour];
	}

	@Override
	public int compareTo(Joueur autreJoueur){ 
		// TODO Auto-generated method stub
		return 0;
	}
}
