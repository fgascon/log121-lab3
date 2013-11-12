/******************************************************
Cours:  LOG121
Projet: Laboratoire 3
Nom du fichier: De.java
Date créé: 2013-10-25
 *******************************************************
Historique des modifications
 *******************************************************
 *@author Shaun-David Sauro, Gabriel St-Hilaire
 *@date 2013-10-25
 *******************************************************/
package ca.etsmtl.log121.lab3;

public class De implements Comparable<De> {
	private Object[] faces;
	private Object valeur;

	@Override
	public int compareTo(De autreDe) {
		// TODO Auto-generated method stub
		return 0;
	}

	public De() {
		Integer[] nbDeFacesDefault = {1,2,3,4,5,6};
		this.faces = nbDeFacesDefault;
	}

	public De(Object[] nbDeFacesRecu) {
		this.faces = nbDeFacesRecu;
		
	}

	public De(Object[] facesRecu, Object valeurRecu) {
		this(facesRecu);
		this.valeur = valeurRecu;
	}

	public void randomize() {
		int uneRef = (int) Math.floor(Math.random() * this.faces.length );
		this.valeur =  faces[ uneRef ];
	}

	public Object getValeur() {
		return valeur;
	}

	public void setValeur(Object valeurRecu) {
		for (int i=0; i<faces.length;i++){
			if (valeurRecu == faces[i]){
				this.valeur = valeurRecu;
			}
		}
		
	}

	public int getNbDeFaces() {
		return faces.length;
	}

	

}
