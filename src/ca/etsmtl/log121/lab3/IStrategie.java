package ca.etsmtl.log121.lab3;


public interface IStrategie {
	
	public void initialiserJeux(Jeux jeux);
	
	public Joueur calculerLeVainqueur(Jeux jeux);
	
	public int calculerScoreTour(Jeux jeux);
}
