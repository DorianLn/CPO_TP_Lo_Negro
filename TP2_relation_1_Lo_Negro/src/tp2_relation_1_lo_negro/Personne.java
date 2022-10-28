/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_lo_negro;

/**
 *
 * @author doria
 */
public class Personne {
    String nom;
    String prenom;
    int nbVoitures ;
    Voiture [] liste_voitures ;
    
    public Personne(String n, String p){
        nom=n;
        prenom=p;
        liste_voitures = new Voiture [3] ;
    }
    @Override
    public String toString () {
    return "Nom :" + nom + "\n prenom : " + prenom;
    }
    
}
