package ca.etsmtl.log121.lab3.bunco;

import ca.etsmtl.log121.lab3.IStrategie;
import ca.etsmtl.log121.lab3.Jeux;
import ca.etsmtl.log121.lab3.de.CollectionDes;
import ca.etsmtl.log121.lab3.de.De;
import ca.etsmtl.log121.lab3.joueur.Joueur;

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
		return 0;
	}
	
}
