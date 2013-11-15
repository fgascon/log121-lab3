/******************************************************
Cours:  LOG121
Projet: Laboratoire 3
Nom du fichier: CollectionDes.java
Date créé: 2013-10-25
 *******************************************************
Historique des modifications
 *******************************************************
 *@author Shaun-David Sauro, Gabriel St-Hilaire, Frédéric Gascon
 *@date 2013-10-25
 *******************************************************/
package ca.etsmtl.log121.lab3;

import java.util.ArrayList;


public class CollectionDes<Type extends Comparable<Type>> implements Iterable<De<Type>> {

	private ArrayList<De<Type>> list;

	public CollectionDes() {
		list = new ArrayList<De<Type>>();
	}
	
	public void ajouterDe(De<Type> de) {
		list.add(de);
	}
	
	public int taille() {
		return list.size();
	}
	
	public De<Type> obtenirDe(int index) {
		return list.get(index);
	}

	@Override
	public IterateurDes<Type> creerIterateur() {
		return new IterateurDes<Type>(this);
	}
}
