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

	@Override
	public int calculerScoreTour(Jeux jeux) {

		
		int nbDeDes = jeux.getDes().taille();
		int resultatsDes[] = null;
		
		for (int i = 0; i < nbDeDes - 1; i++ ){
			 resultatsDes[i] = (Integer)jeux.getDes().obtenirDe(i).getValeur();
		}
		

		Joueur joueurCourant = jeux.getJoueurCourant();
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
