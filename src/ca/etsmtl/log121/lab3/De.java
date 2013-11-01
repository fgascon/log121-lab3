package ca.etsmtl.log121.lab3;

public class De implements Comparable<De> {
	private Object[] nbDeFaces;
	private Object valeur;

	@Override
	public int compareTo(De autreDe) {
		// TODO Auto-generated method stub
		return 0;
	}

	public De() {
		Integer[] nbDeFacesDefault = {1,2,3,4,5,6};
		this.nbDeFaces = nbDeFacesDefault;
	}

	public De(Object[] nbDeFacesRecu) {
		this.nbDeFaces = nbDeFacesRecu;
		
	}

	public De(Object[] nbDeFacesRecu, int valeurRecu) {
		this(nbDeFacesRecu);
		this.valeur = valeurRecu;
	}

	public void randomize() {
		this.valeur = (int) Math.floor((Math.random() * 6) + 1);
	}

	public Object getValeur() {
		return valeur;
	}

	public void setValeur(int valeurRecu) {
		this.valeur = valeurRecu;
	}

	public Object[] getnbDeFaces() {
		return nbDeFaces;
	}

	public void setnbDeFaces(Object[] nbDeFacesRecu) {
		this.nbDeFaces = nbDeFacesRecu;
	}

}
