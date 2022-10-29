/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_lo_negro;

/**
 *
 * @author doria
 */
public class Voiture {
    String Modele;//Création de plusieurs variable dans la class voiture 
    String Marque;
    int PuissanceCV;
    Personne proprietaire;// création d'une varaible de type Personne
    int nbvoiture = 0 ; 
    
    public Voiture(String Mod, String Marq, int Pui){//Création de notre constructeur qui va prendre en entrée les différentes caractéristique de la voiture 
    Modele = Mod;
    Marque=Marq;
    PuissanceCV = Pui;
    proprietaire = null;// si la voiture n'a pas de propriétaire alors propiétaire = null
        
    }
    @Override// création du string tostring
    public String toString () {
    return "modèle :" + Modele + "\n Marque : " + Marque + "\n PuissanceCV" + PuissanceCV+ "\n Propriétaire : " + proprietaire;
    }
    
    
}
