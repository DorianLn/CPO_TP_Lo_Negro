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
    
    public Voiture(String Mod, String Marq, int Pui){
    Modele = Mod;
    Marque=Marq;
    PuissanceCV = Pui;
        
    }
    @Override
    public String toString () {
    return "modèle :" + Modele + "\n Marque : " + Marque + "\n PuissanceCV" + PuissanceCV;
    }
    
    
}
