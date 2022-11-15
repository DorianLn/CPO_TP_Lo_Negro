package Armes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import Armes.Armes;

/**
 *
 * @author doria
 */
public class Epee extends Armes {
    private int finesse; 
    String nom;
    
    public Epee(String N,int finesse , int Att ){
        super(N,Att);
        if(finesse >0 & finesse<100){
            this.finesse= finesse;
            nom = N;
        }
        else{
            this.finesse=1;
            nom=N;
    
        }
    }
    public int getfinesse(){
        return finesse; 
    }
    
    public void setfinesse(int finesse ){
        if (finesse>0){
            this.finesse = finesse;
        }
    }
    @Override// création du string tostring
    public String toString () {
        return "Epee{" + "finesse=" + finesse + " nom arme : "+ nom +'}';
    }
}
