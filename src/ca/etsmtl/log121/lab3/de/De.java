package ca.etsmtl.log121.lab3.de;

public class De implements Comparable<De> {
	private  int nbDeFaces;
    private int valeur;
    
	@Override
	public int compareTo(De autreDe) {
		// TODO Auto-generated method stub
		return 0;
	}
	public De(){
	this.nbDeFaces = 6;
	}
	
	public void randomize(){
	this.valeur=(int) Math.floor((Math.random()*6)+1);
	}
}
