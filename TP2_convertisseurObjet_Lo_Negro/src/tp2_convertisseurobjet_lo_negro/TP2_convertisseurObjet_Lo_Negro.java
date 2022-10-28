/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_lo_negro;

/**
 *
 * @author doria
 */
public class TP2_convertisseurObjet_Lo_Negro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Convertisseur C1 = new Convertisseur ();
        System.out.println(C1.CelciusVersKelvin(14.3));   
        Convertisseur C2 = new Convertisseur ();
        System.out.println(C2.CelciusVersKelvin(33.3));   
        Convertisseur C3 = new Convertisseur ();
        System.out.println(C3.KelvinVersFarenheit(45.3)); 
        System.out.println(C1.CelciusVersKelvin(4.3));
        System.out.println(C1.toString());
    }
        
}
