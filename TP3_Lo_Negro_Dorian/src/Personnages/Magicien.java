/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author doria
 */
public class Magicien extends Personnages{
    private boolean Confirme; 
    String Nom; 
    int life;
    
    public Magicien(String nom, int Vie,boolean confirme ){
        super(nom, Vie);
        Nom=nom;
        this.Confirme = confirme;
        life= Vie;
        
            
        
    }
    public void setConfirme(boolean confirme ){//change la valeur
        this.Confirme = confirme;
        
        
    }
    
    @Override// création du string tostring
    public String toString () {
        return "Magicien{" + "nom du perso : "+ Nom + " nombre de vie : " + life + "Confirme= " + Confirme +'}';
    }
}
