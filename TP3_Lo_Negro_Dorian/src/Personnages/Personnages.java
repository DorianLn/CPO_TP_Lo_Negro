/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author doria
 */
public class Personnages {
    String nom; 
    int niveau_de_vie;
    
    public Personnages (String Nom, int nv){//constructeur
        nom = Nom;
        niveau_de_vie = nv;
    }
    
    
    @Override// création du string tostring
    public String toString () {
    return "niveaude vie : " + niveau_de_vie + "nom personnage : " + nom ;
    
    }
}
