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
    String nom;//Création de plusieurs variables dans la class Personne
    String prenom;
    int nbVoitures = 0 ;
    Voiture [] liste_voitures ;// création d'un tableau de type Voiture 
   
    
    public Personne(String n, String p){//création de notre constructeur
        nom=n;
        prenom=p;
        liste_voitures = new Voiture [3] ;//création du tableau contenant 3 cases
    }
    @Override// création du string toString 
    public String toString () {
    return "Nom :" + nom + "\n prenom : " + prenom;
    }
    
    public boolean ajouter_voiture( Voiture voiture_a_ajouter) {//création de notre fonction boleen qui nous permettra de determiner si une voiture à déjà un proprietaire 
       if (voiture_a_ajouter.proprietaire !=null){// si proprietaire different de null alors quelqu'un possède la voiture 
           return false;// on retourne false
       }
       else{
        if (nbVoitures>=3){//si le nombre de voiture est supérieur à 3 qui est la limite de voiture pouvant posséder 
           return false;//on retourne false , on ne peut rien faire
       }
        else{
            liste_voitures[nbVoitures]=voiture_a_ajouter;//sinon on ajoute une voiture dans la case du tableau où il n'y apas encore de voiture 
            nbVoitures += 1;
            voiture_a_ajouter.proprietaire = this ; 
            return true;
            
        } 
    }

    
    
    }
}
