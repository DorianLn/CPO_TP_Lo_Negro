/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_lo_negro_dorian;

/**
 *
 * @author doria
 */
public class Baton extends Armes {
    private int ages;
        
        public Baton( String n,int ages, int att){
            super(n,att );
            if (ages>0 & ages<100){
                this.ages = ages;  
            }
            else{
                this.ages=1;
        }    
    }
    public int getAges(){
        return ages; 
    }
    
    public void setAges(int ages ){
        if (ages>0){
            this.ages = ages;
        }
    }
    @Override// création du string tostring
    public String toString () {
        return "Baton{" + "Age=" + ages + '}';
    }
}
