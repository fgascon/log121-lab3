/******************************************************
Cours:  LOG121
Projet: Laboratoire 3
Nom du fichier: Bunco.java
Date créé: 2013-10-25
 *******************************************************
Historique des modifications
 *******************************************************
 *@author Shaun-David Sauro, Gabriel St-Hilaire, Frédéric Gascon
 *@date 2013-10-25
 *******************************************************/
package ca.etsmtl.log121.lab3.bunco;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import ca.etsmtl.log121.lab3.CollectionDes;
import ca.etsmtl.log121.lab3.De;
import ca.etsmtl.log121.lab3.IStrategie;
import ca.etsmtl.log121.lab3.Jeux;
import ca.etsmtl.log121.lab3.Joueur;

public class Bunco implements IStrategie {
	
	@Override
	public void initialiserJeux(Jeux jeux) {
		jeux.setNbTours(6);
		
		CollectionDes des = jeux.getDes();
		Integer[] listeFaces = {1,2,3,4,5,6};
		for(int i=0; i<3; i++) {
			des.ajouterDe(new De<Integer>(listeFaces));
		}
	}

	@Override
	public Joueur[] calculerLeVainqueur(Jeux jeux) {
		ComparateurJoueur unComparateur = new ComparateurJoueur();
		
		Joueur desJoueurs[] = jeux.getJoueurs().toArray();
		Arrays.sort(desJoueurs,unComparateur);
		return desJoueurs;
	}

	@Override
	public int calculerScoreTour(Jeux jeux) {
		int scoreAccumule = 0;
		
		
		Joueur joueurCourant = jeux.getJoueurCourant().getNext();
		
		int nbDeDes = jeux.getDes().taille();
		
		int resultatsDes[] = new int[nbDeDes];
		
		ArrayList<Integer> desACompare = new ArrayList<Integer>();
		
		for (int i=0; i < nbDeDes ;i++){
			De<Integer> leDe = (De<Integer>)jeux.getDes().obtenirDe(i);
			resultatsDes[i] = (Integer) leDe.getValeur();	
		}
		
		for (int i=0; i<nbDeDes;i++){
			if (resultatsDes[i] == jeux.getTourCourant() ){
				desACompare.add(resultatsDes[i]);
			}
		}
		
		if (desACompare.size() == 3){
			scoreAccumule = 21;
		}else if(desACompare.size() == 2){
			scoreAccumule = jeux.getTourCourant() * 2;
		}else if(desACompare.size() == 1) {
			scoreAccumule = jeux.getTourCourant();
		}else if(resultatsDes[0] == resultatsDes[1] && resultatsDes[1] == resultatsDes[2]){
			scoreAccumule = 5;
		}
		
		joueurCourant.setPointsTours(scoreAccumule);
		
		return scoreAccumule;
	}
	
	private class ComparateurJoueur implements Comparator<Joueur>{

		@Override
		public int compare(Joueur arg0, Joueur arg1) {
			return arg1.compareTo(arg0);
		}
		
	}
}
