/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_lo_negro;

import java.util.Scanner;

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
        Convertisseur C1 = new Convertisseur ();//Création d'un objet C1
        System.out.println(C1.CelciusVersKelvin(14.3));//on test si notre code fonctionne bien    
        Convertisseur C2 = new Convertisseur ();//création d'un objet C2
        System.out.println(C2.CelciusVersKelvin(33.3));   
        Convertisseur C3 = new Convertisseur ();//Création d'un objet C3
        System.out.println(C3.KelvinVersFarenheit(45.3)); //on test si notre code fonctionne bien 
        System.out.println(C1.CelciusVersKelvin(4.3));//on test si notre code fonctionne bien 
        System.out.println(C1.toString());
        
        System.out.println("Tapez une conversion (1 = Celcius vers Kelvin, 2 Kelvin vers Celcius, 3= Celcius vers Farenheit, 4 = Farenheit vers Celcius, 5 = Kelvin vers Farenheit, 6 = Farenheit vers Kelvin ): ");
        Scanner sc = new Scanner(System.in);// on utilise la commande scanner pour demandez à la personne de rentrée quel type de conversion elle veut effectuer
        int a = sc.nextInt();
        if (a == 1){// Création de condition pour pouvoir effectuer la bonne conversion demandée 
            System.out.println("Entrez votre température en celcius:");
            int b = sc.nextInt();
            System.out.println(C1.CelciusVersKelvin(b)); 
            
        }
        if (a == 2){
            System.out.println("Entrez votre température en Kelvin:");
            int b = sc.nextInt();
            System.out.println(C1.KelvinVersCelcius(b)); 
            System.out.println(b);
                
        }
        if (a == 3){
            System.out.println("Entrez votre température en Farenheit:");
            int b = sc.nextInt();
            System.out.println(C1.FarenheitVersCelcius(b)); 
          
                
                
        }
        if (a == 4){
            System.out.println("Entrez votre température en Celcius:");
            int b = sc.nextInt();
            System.out.println(C1.CelciusVersFarenheit(b)); 
           
                    
        }
        if (a == 5){
            System.out.println("Entrez votre température en Kelvin:");
            int b = sc.nextInt();
            System.out.println(C1.KelvinVersFarenheit(b)); 
            
            
                
        }
        if (a == 6){
            System.out.println("Entrez votre température en Farenheit:");
            int b = sc.nextInt();
            System.out.println(C1.FarenheitVersKelvin(b)); 
                        
        }   
    }
}

