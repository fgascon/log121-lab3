package ca.etsmtl.log121.lab3.bunco;

import ca.etsmtl.log121.lab3.CollectionDes;
import ca.etsmtl.log121.lab3.De;
import ca.etsmtl.log121.lab3.DeFactory;

public class BuncoDeFactory implements DeFactory<Integer> {

	@Override
	public CollectionDes<Integer> generateDes() {
		CollectionDes<Integer> des = new CollectionDes<Integer>();
		Integer[] listeFaces = {1,2,3,4,5,6};
		for(int i=0; i<3; i++) {
			des.ajouterDe(new De<Integer>(listeFaces));
		}
		return des;
	}
}
