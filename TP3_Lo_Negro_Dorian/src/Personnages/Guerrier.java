/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author doria
 */
public class Guerrier extends Personnages {
    private boolean cheval;
    String NomG;
    int lifeG;
    
    public Guerrier(String nom,int Vie , boolean cheval){
        super(nom, Vie);
        NomG=nom;
        lifeG=Vie;
        
        this.cheval = cheval;
            
        
        
    }
    public void setcheval(boolean cheval ){//change la valeur
        this.cheval = cheval;
    }
    
    @Override// création du string tostring
    public String toString () {
        return "Guerrier{" + "nom du perso : "+ NomG + " nombre de vie : " + lifeG + "Cheval= " + cheval +'}';
    }
    
}
