package ca.etsmtl.log121.lab3;

import java.util.ArrayList;


public class Joueur implements Comparable<Joueur> {
	
	private String nom;
	private int points;
	private ArrayList<Integer> pointsTours = new ArrayList<Integer>(1);
	private static int numeroJoueur = 1;
	
	public Joueur(){
		this.nom = ("Joueur" + numeroJoueur );
		numeroJoueur= numeroJoueur+1;
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
	
	public void setPointsTours(int desPoints){
		this.pointsTours.add(desPoints);
	}
	
	public int getPointsTours(int unTour){
		return this.pointsTours.get(unTour-1);
	}

	@Override
	public int compareTo(Joueur autreJoueur){ 
		if (this.getPoints()== autreJoueur.getPoints())
		return 0;
		else if (this.getPoints() > autreJoueur.getPoints())
		return 1;
		else
		return -1;
	}
}
