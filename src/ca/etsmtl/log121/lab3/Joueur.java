/******************************************************
Cours:  LOG121
Projet: Laboratoire 3
Nom du fichier: Joueur.java
Date créé: 2013-10-25
 *******************************************************
Historique des modifications
 *******************************************************
 *@author Shaun-David Sauro, Gabriel St-Hilaire, Frédéric Gascon
 *@date 2013-10-25
 *******************************************************/
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
		Integer points = getPoints();
		Integer autrePoints = autreJoueur.getPoints();
		return points.compareTo(autrePoints);
	}
}
