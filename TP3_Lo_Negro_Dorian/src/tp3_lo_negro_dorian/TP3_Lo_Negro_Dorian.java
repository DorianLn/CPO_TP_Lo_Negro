/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_lo_negro_dorian;

import Armes.Epee;
import Armes.Baton;
import Armes.Armes;
import java.util.ArrayList;

/**
 *
 * @author doria
 */
public class TP3_Lo_Negro_Dorian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Armes A = new Armes ("baton" , 100);
        
        Epee epee1 = new Epee( "Excalibur",7, 5);//on test notre code en créant des epées et des bâtons 
        System.out.println(epee1);
        Epee epee2 = new Epee( "Durandal",4,7);
        System.out.println(epee2);
        
        Baton baton1 = new Baton( "Chêne", 4, 5);
        System.out.println(baton1);
        Baton baton2 = new Baton( "Charme", 5, 6);
        System.out.println(baton2);
        
        ArrayList<Armes> tab_armes = new ArrayList<Armes>();
        
        tab_armes.add(epee1);
        tab_armes.add(epee2);
        tab_armes.add(baton1);
        tab_armes.add(baton2);
        System.out.println(tab_armes);
        
        Magicien magicien1 = new Magicien("Gandalf",65,true);
        System.out.println(magicien1);
        Magicien magicien2 = new Magicien("Garcimore", 44, false);
        Guerrier guerrier1 = new Guerrier("Conan", 78, false);
        Guerrier guerrier2 = new Guerrier("Lannister", 45, true);
        
        ArrayList<Personnages> tab_perso = new ArrayList<Personnages>();
        
        tab_perso.add(magicien1);
        tab_perso.add(magicien2);
        tab_perso.add(guerrier1);
        tab_perso.add(guerrier2);
        
        System.out.println(tab_perso);
        
                
    }
    
}
