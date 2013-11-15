package ca.etsmtl.log121.lab3;

public interface JeuxFactory<Type extends Comparable<Type>> {
	
	public Jeux<Type> generateJeux();

	public Jeux<Type> generateJeux(int nbJoueurs);

	public Jeux<Type> generateJeux(String[] nomsJoueurs);
}
