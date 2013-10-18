package ca.etsmtl.log121.lab3.de;

import java.util.ArrayList;

import ca.etsmtl.log121.lab3.Iterable;

public class CollectionDes implements Iterable<De> {

	private ArrayList<De> list;

	public CollectionDes() {
		list = new ArrayList<De>();
	}
	
	public void ajouterDe(De de) {
		list.add(de);
	}

	@Override
	public IterateurDes creerIterateur() {
		// TODO Auto-generated method stub
		return null;
	}

}
