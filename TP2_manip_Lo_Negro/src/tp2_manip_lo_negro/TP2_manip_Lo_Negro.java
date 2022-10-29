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
        Tartiflette assiette1 = new Tartiflette(500);// on créé notre assiette1 et on lui attribu un nombre calorie grâce a la classde Tartiflette
        Tartiflette assiette2 = new Tartiflette(600);// on créé une deuxième assiette 
        Tartiflette assiette3 = assiette2; //assiette 3 et 2 ne font qu'une seule assiette 
        System.out.println(assiette1.nbCalories);//affichage des calories des assiettes 
        System.out.println(assiette2.nbCalories);
        System.out.println(assiette3.nbCalories);
        System.out.println("nb de calories de Assiette 2 : " +
        assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " +
        assiette3.nbCalories) ;
        
        
        assiette2.nbCalories += 300;
        System.out.println(assiette2.nbCalories);
        System.out.println(assiette3.nbCalories);//assiette 2 et 3 ont bien le même nombre de calorie
        
        int changement;//création d'une variable changement pour pouvoir interchanger les assiette 2 et 3
        changement = assiette1.nbCalories;// on utilise la variable pour interchangé les valeurs l'assiette1 et 2
        assiette1.nbCalories=assiette2.nbCalories;
        assiette2.nbCalories=changement;// changement des valeurs assiette1 = assiette 2 et inversément 
        
        //Moussaka assiette666 = assiette1 ; Moussaka n'est pas convertible en tartiflette
        //Moussaka assiette667 = new Tartiflette() ; Moussaka n'a aucun rapport avec tartiflette donc cette ligne ne fonctionne pas
        
        Moussaka TableauM [] = new Moussaka[10];//Création d'une boucle pour remplir les valeur du tableau Moussaka
        for (int i=0; i < TableauM.length; i++){
            TableauM[i]=new Moussaka(i*i*10);
            
        }
        
    }
    
}
