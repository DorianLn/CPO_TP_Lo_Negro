/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author doria
 */
public class Armes {
    String nom; 
    int nvattack;
   
    public Armes (String NomA ,int nvA){// constructeur 
        if (nvA<=100 || nvA>0){
           nom= NomA;
           nvattack = nvA; 
        }
        if (nvA>100){
            nvA=100;
            
        }
        if(nvA<0){
            nvA=0;
            nom= NomA;
            nvattack = nvA;
        }
    }
    
     @Override// création du string tostring
    public String toString () {
    return "Type d'arme : " + nom + "\nNiveau d'attaque : " + nvattack ;
    }
}
