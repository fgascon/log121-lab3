/******************************************************
Cours:  LOG121
Projet: Laboratoire 3
Nom du fichier: IStrategie.java
Date créé: 2013-10-25
 *******************************************************
Historique des modifications
 *******************************************************
 *@author Shaun-David Sauro, Gabriel St-Hilaire
 *@date 2013-10-25
 *******************************************************/
package ca.etsmtl.log121.lab3;


public interface IStrategie {
	
	public void initialiserJeux(Jeux jeux);
	
	public Joueur[] calculerLeVainqueur(Jeux jeux);
	
	public int calculerScoreTour(Jeux jeux);
}
