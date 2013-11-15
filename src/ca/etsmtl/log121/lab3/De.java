/******************************************************
Cours:  LOG121
Projet: Laboratoire 3
Nom du fichier: De.java
Date créé: 2013-10-25
 *******************************************************
Historique des modifications
 *******************************************************
 *@author Shaun-David Sauro, Gabriel St-Hilaire, Frédéric Gascon
 *@date 2013-10-25
 *******************************************************/
package ca.etsmtl.log121.lab3;

public class De<Type extends Comparable<Type>> implements Comparable<De<Type>> {
	private Type[] faces;
	private Type valeur;

	@Override
	public int compareTo(De<Type> autreDe) {
		return getValeur().compareTo(autreDe.getValeur());
	}

	public De(Type[] nbDeFacesRecu) {
		this.faces = nbDeFacesRecu;
	}

	public De(Type[] facesRecu, Type valeurRecu) {
		this(facesRecu);
		this.valeur = valeurRecu;
	}

	public void randomize() {
		int ref = (int) Math.floor(Math.random() * this.faces.length );
		this.valeur =  faces[ref];
	}

	public Type getValeur() {
		return valeur;
	}

	public void setValeur(Type valeurRecu) {
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
