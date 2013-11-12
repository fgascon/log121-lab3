/******************************************************
Cours:  LOG121
Projet: Laboratoire 3
Nom du fichier: Bunco.java
Date créé: 2013-10-25
 *******************************************************
Historique des modifications
 *******************************************************
 *@author Shaun-David Sauro, Gabriel St-Hilaire
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
		for(int i=0; i<3; i++) {
			des.ajouterDe(new De());
		}
	}

	@Override
	public Joueur[] calculerLeVainqueur(Jeux jeux) {
		
		
		ComparateurJoueur unComparateur = new ComparateurJoueur();
		
		Joueur desJoueurs[] = jeux.getJoueurs().toArray();
		Arrays.sort(desJoueurs,unComparateur);
		return desJoueurs;
	}

	@SuppressWarnings("null")
	@Override
	public int calculerScoreTour(Jeux jeux) {
		int scoreAccumule = 0;
		Joueur joueurCourant = (Joueur) jeux.getJoueurCourant().getNext();
		int nbDeDes = jeux.getDes().taille();
		int resultatsDes[] = null ;
		int desACompare[] = null;
		
		for (int i=0; i<nbDeDes-1;i++){
			De leDe = jeux.getDes().obtenirDe(i);
			resultatsDes[i] = (Integer) leDe.getValeur();	
		}
		
		for (int i=0; i<nbDeDes-1;i++){
			if (resultatsDes[i]== jeux.getTourCourant()){
				desACompare [i] = resultatsDes[i];
			}
		}
		
		if (desACompare.length == 3){
			scoreAccumule = 21;
		}else if(desACompare.length == 2){
			scoreAccumule = jeux.getTourCourant() * 2;
		}else if(desACompare.length == 1) {
			scoreAccumule = jeux.getTourCourant();
		}else if(resultatsDes[0]== resultatsDes[1] && resultatsDes[1] == resultatsDes[2]){
			scoreAccumule = 5;
		}
		
		joueurCourant.setPointsTours(scoreAccumule);
		
		

		
		return 0;
	}
	
	private class ComparateurJoueur implements Comparator<Joueur>{

		@Override
		public int compare(Joueur arg0, Joueur arg1) {
			// TODO Auto-generated method stub
			return 0;
		}
		
	}
	
	
	
}
