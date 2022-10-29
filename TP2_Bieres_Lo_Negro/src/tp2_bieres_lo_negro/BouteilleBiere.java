package tp2_bieres_lo_negro;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author doria
 */
public class BouteilleBiere {
    String nom;//création de variable de différent type dans la class BouteilleBiere
    double degreAlcool;
    String brasserie;
    boolean ouverte;
    
    public void lireEtiquette() {//ajout d'une méthode qui permet de affiche simplement à l’écran les informations contenues sur l’étiquette de la bouteille de bière
        System.out.println("Bouteille de " + nom +" (" + degreAlcool +
        " degres) \nBrasserie : " + brasserie ) ;
    }
    
    public BouteilleBiere(String unNom, double unDegre, String  // Création du constructeur avec en entrée les différentes caractéristiques de la bière
    uneBrasserie) {
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false;
    }
    
    public boolean  Décapsuler() {// création d'une fonction boleen qui va simplement decapsuler une bouteille si ce n'est pas déjà fait 
        if(ouverte==false){
            ouverte= true; 
            return true;
        }
        else{
            System.out.println("erreur : bouteille déjà decapsulée");
            return false; 
            
        }
        
    }
    
    
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = nom + " (" + degreAlcool + " degrés)"
                + "Ouverte ? ";
        if (ouverte == true ) chaine_a_retourner += "oui" ;
        else chaine_a_retourner += "non" ;
        return chaine_a_retourner ;
}
    

    
}
