/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_lo_negro;

/**
 *
 * @author doria
 */
public class TP2_manip_Lo_Negro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);
        Tartiflette assiette3 = assiette2; //assiette 3 et 2 ne font qu'une seule assiette 
        System.out.println(assiette1.nbCalories);
        System.out.println(assiette2.nbCalories);
        System.out.println(assiette3.nbCalories);
        System.out.println("nb de calories de Assiette 2 : " +
        assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " +
        assiette3.nbCalories) ;//assiette 2 et 3 ont bien le même nombre de calorie
    }
    
}
