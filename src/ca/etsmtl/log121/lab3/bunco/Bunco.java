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
	public Joueur calculerLeVainqueur(Jeux jeux) {
		return null;
	}

	@Override
	public int calculerScoreTour(Jeux jeux) {
		Joueur joueurCourant = jeux.getJoueurCourant();
		return 0;
	}
	
}
