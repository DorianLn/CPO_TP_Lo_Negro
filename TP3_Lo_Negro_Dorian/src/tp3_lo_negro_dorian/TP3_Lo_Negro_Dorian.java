/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_lo_negro_dorian;

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
    }
    
}
