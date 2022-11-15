/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import Armes.Armes;

/**
 *
 * @author doria
 */
public class Baton extends Armes {
    private int ages;
    String nomB;
        
        public Baton( String n,int ages, int att){
            super(n,att );
            if (ages>0 & ages<100){
                this.ages = ages; 
                nomB=n;
            }
            else{
                this.ages=1;
                nomB=n;
        }    
    }
    public int getages(){//pour avoir la valeur 
        return ages; 
    }
    
    public void setages(int ages ){//change la valeur
        if (ages>0){
            this.ages = ages;
        }
    }
    @Override// création du string tostring
    public String toString () {
        return "Baton{" + "Age=" + ages + " nom baton : " + nomB +'}';
    }
}
