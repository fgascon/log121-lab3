/******************************************************
Cours:  LOG121
Projet: Laboratoire 3
Nom du fichier: CollectionDes.java
Date créé: 2013-10-25
 *******************************************************
Historique des modifications
 *******************************************************
 *@author Shaun-David Sauro, Gabriel St-Hilaire
 *@date 2013-10-25
 *******************************************************/
package ca.etsmtl.log121.lab3;

import java.util.ArrayList;


public class CollectionDes implements Iterable<De> {

	private ArrayList<De> list;

	public CollectionDes() {
		list = new ArrayList<De>();
	}
	
	public void ajouterDe(De de) {
		list.add(de);
	}
	
	public int taille() {
		return list.size();
	}
	
	public De obtenirDe(int index) {
		return list.get(index);
	}

	@Override
	public IterateurDes creerIterateur() {
		return new IterateurDes(this);
	}

}
