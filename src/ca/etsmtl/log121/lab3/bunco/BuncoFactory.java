package ca.etsmtl.log121.lab3.bunco;

import ca.etsmtl.log121.lab3.Jeux;
import ca.etsmtl.log121.lab3.JeuxFactory;

public class BuncoFactory implements JeuxFactory<Integer> {

	@Override
	public Jeux<Integer> generateJeux() {
		Jeux<Integer> jeux = new Jeux<Integer>(new Bunco(), new BuncoDeFactory());
		jeux.setNbTours(6);
		return jeux;
	}

	@Override
	public Jeux<Integer> generateJeux(int nbJoueurs) {
		Jeux<Integer> jeux = new Jeux<Integer>(new Bunco(), new BuncoDeFactory(), nbJoueurs);
		jeux.setNbTours(6);
		return jeux;
	}

	@Override
	public Jeux<Integer> generateJeux(String[] nomsJoueurs) {
		Jeux<Integer> jeux = new Jeux<Integer>(new Bunco(), new BuncoDeFactory(), nomsJoueurs);
		jeux.setNbTours(6);
		return jeux;
	}
}
