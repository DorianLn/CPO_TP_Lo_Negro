/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_lo_negro_dorian;

/**
 *
 * @author doria
 */
public class Magicien extends Personnages{
    private boolean Confirme; 
    
    public Magicien(String nom, int Vie,boolean confirme ){
        super(nom, Vie);
        
        this.Confirme = confirme;
        
            
        
    }
    public void setConfirme(boolean confirme ){//change la valeur
        this.Confirme = confirme;
        
        
    }
    
    @Override// création du string tostring
    public String toString () {
        return "Magicien{" + "Confirme= " + Confirme +'}';
    }
}
