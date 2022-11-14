/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_lo_negro_dorian;

/**
 *
 * @author doria
 */
public class Epee extends Armes {
    private int finesse; 
    
    public Epee(String N,int finesse , int Att ){
        super(N,Att);
        if(finesse >0 & finesse<100){
            this.finesse= finesse;
        }
        else{
            this.finesse=1;
    
        }
    }
    public int getFinesse(){
        return finesse; 
    }
    
    public void setFinesse(int finesse ){
        if (finesse>0){
            this.finesse = finesse;
        }
    }
    @Override// création du string tostring
    public String toString () {
        return "Epee{" + "finesse=" + finesse + '}';
    }
}
