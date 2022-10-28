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
    String Modele;
    String Marque;
    int PuissanceCV;
    Personne proprietaire;
    int nbvoiture = 0 ; 
    
    public Voiture(String Mod, String Marq, int Pui){
    Modele = Mod;
    Marque=Marq;
    PuissanceCV = Pui;
    proprietaire = null;
        
    }
    @Override
    public String toString () {
    return "modèle :" + Modele + "\n Marque : " + Marque + "\n PuissanceCV" + PuissanceCV+ "\n Propriétaire : " + proprietaire;
    }
    
    
}
