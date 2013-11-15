/******************************************************
Cours:  LOG121
Projet: Laboratoire 3
Nom du fichier: IStrategie.java
Date cr��: 2013-10-25
 *******************************************************
Historique des modifications
 *******************************************************
 *@author Shaun-David Sauro, Gabriel St-Hilaire, Fr�d�ric Gascon
 *@date 2013-10-25
 *******************************************************/
package ca.etsmtl.log121.lab3;


public interface IStrategie<Type extends Comparable<Type>> {
	
	public void initialiserJeux(Jeux<Type> jeux);
	
	public Joueur[] calculerLeVainqueur(Jeux<Type> jeux);
	
	public int calculerScoreTour(Jeux<Type> jeux);
}
