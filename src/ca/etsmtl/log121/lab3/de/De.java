package ca.etsmtl.log121.lab3.de;

public class De implements Comparable<De> {
	private int nbDeFaces;
	private int valeur;

	@Override
	public int compareTo(De autreDe) {
		// TODO Auto-generated method stub
		return 0;
	}

	public De() {
		this.nbDeFaces = 6;
	}

	public De(int nbDeFacesRecu) {
		this.nbDeFaces = nbDeFacesRecu;
		
	}

	public De(int nbDeFacesRecu, int valeurRecu) {
		this(nbDeFacesRecu);
		this.valeur = valeurRecu;
	}

	public void randomize() {
		this.valeur = (int) Math.floor((Math.random() * 6) + 1);
	}

	public int getValeur() {
		return valeur;
	}

	public void setValeur(int valeurRecu) {
		this.valeur = valeurRecu;
	}

	public int getnbDeFaces() {
		return nbDeFaces;
	}

	public void setnbDeFaces(int nbDeFacesRecu) {
		this.nbDeFaces = nbDeFacesRecu;
	}

}
