/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Armes;
import java.util.ArrayList;

/**
 *
 * @author doria
 */
public class Personnages {
    public ArrayList<Armes> nb_arme = new ArrayList<Armes>();
    String nom; 
    int niveau_de_vie;
    int caseT;
    
    
    public Personnages (String Nom, int nv ){//constructeur
        nom = Nom;
        niveau_de_vie = nv;
        
    }
    
   
    
    public void setArmeperso(Armes arme ){//change la valeur
        caseT= nb_arme.size();
        if (caseT<=5){
            nb_arme.add(arme);
        }
        
        
        
    }
    
    
    
    
    @Override// création du string tostring
    public String toString () {
    return "niveaude vie : " + niveau_de_vie + "nom personnage : " + nom ;
    
    }
}
