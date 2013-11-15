package ca.etsmtl.log121.lab3;

public interface DeFactory<Type extends Comparable<Type>> {
	
	public CollectionDes<Type> generateDes();
}
