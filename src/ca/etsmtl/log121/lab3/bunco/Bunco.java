package ca.etsmtl.log121.lab3.bunco;

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
		
		int pointHauts = 0;
		Joueur joueurGagnant[] = null;
		int tourCourant = jeux.getTourCourant();
		
		for (int i = 0; i < jeux.getJoueurs().taille()-1;i++){
			
			int pointJoueur = jeux.getJoueurs().obtenirJoueur(i).getPointsTours(tourCourant);
			
			Joueur joueurCourant = jeux.getJoueurs().obtenirJoueur(i);
			
			if ( pointJoueur > pointHauts ){
				if ( joueurGagnant[0] == null ){
					joueurGagnant[0] = 
					pointHauts = pointJoueur;
				}
				else{
					Joueur joueurTemp = joueurGagnant[0];
					joueurGagnant[0] = joueurCourant;
					if 
					
					
				}
				pointHauts = pointJoueur;
			}
			
		}
		return joueurGagnant[];
	}

	@Override
	public int calculerScoreTour(Jeux jeux) {
		
		int nbDeDes = jeux.getDes().taille();
		int resultatsDes[] = null;
		
		for (int i = 0; i < nbDeDes - 1; i++ ){
			 resultatsDes[i] = (Integer)jeux.getDes().obtenirDe(i).getValeur();
		}
		
		return 0;
	}
	
}
