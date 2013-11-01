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
