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
    
    public Personne(String n, String p){
        nom=n;
        prenom=p;
    }
    @Override
    public String toString () {
    return "Nom :" + nom + "\n prenom : " + prenom;
    }
    
}
