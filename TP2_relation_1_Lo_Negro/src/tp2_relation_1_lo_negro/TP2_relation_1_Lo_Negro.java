/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_lo_negro;

/**
 *
 * @author doria
 */
public class TP2_relation_1_Lo_Negro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ; // on test notre code, création d'un nouvelle objet (unclio) Voiture avec ces caractéristiques 
        Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ;//Création d'un second objet Voiture avec ses caractéristiques
        Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;//création d'une 3ème voiture
        Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;//création d'une 4ème voiture
        Personne bob = new Personne("Bobby", "Sixkiller");//création d'une personne (Bob)
        Personne reno = new Personne("Reno", "Raines");//création d'une deuxième personne (reno)
        System.out.println("liste des voitures disponibles "+ uneClio +
        "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;// on affiche toutes les voitures avec leurs caractéistiques 
        
        
        bob.liste_voitures[0] = uneClio ;//on ajoute une voiture Clio a Bob dans la première case (case 0) du tableau liste_voiture 
        bob.nbVoitures += 1 ;//On rajoute 1 au nombre de voiture appartenant à Bob
        uneClio.proprietaire = bob ;//Bob devient proprietaire de la Clio
        System.out.println("la premiere voiture de Bob est " +
        bob.liste_voitures[0] ) ;//affichage de la première voiture de bob avec ses caractéristiques 
        
        bob.liste_voitures[1] = uneClio ;// on ajoute une deuxième clio à bob dans la deuxième case du tableau
        bob.nbVoitures += 1;//On rajoute 1 au nombre de voiture appartenant à Bob
        System.out.println("la deuxième voiture de Bob est " + bob.liste_voitures[1] ) ;//affichage de la deuxième voiture de bob avec ses caractéristiques 
        
        reno.liste_voitures[0] = une2008 ;// on ajoute une 2008 à Reno dans la première case du tableau liste_voitures
        reno.nbVoitures +=1 ;//On rajoute 1 au nombre de voiture appartenant à reno
        une2008.proprietaire = reno;//reno devient proprietaire de la 2008
        System.out.println("la premiere voiture de reno est " +
        reno.liste_voitures[0] );//affichage de la première voiture de reno
        
        reno.liste_voitures[1]=uneMicra;//on ajoute une deuxième voiture qui est un Clio à Reno dans la deuxième case du tableau 
        reno.nbVoitures +=1 ;//On rajoute 1 au nombre de voiture appartenant à reno
        uneMicra.proprietaire= reno;//reno devient proprietaire de la micra
        System.out.println("la deuxième voiture de Reno est " + reno.liste_voitures[1] ) ;//affichage de la deuxième voiture de reno
        
        Voiture batmobile = new Voiture ("X0R0b1", "DC Comics", 40000000 ) ;// Pour tester notre dernière partie de code avec la fonction boleen on créer une nouvelle voiture 
        Personne kevin = new Personne("kevin", "robin");// on créer une nouvelle personne 
        System.out.println(kevin.ajouter_voiture( une2008));//et on affiche ce que nous renvoie la fcnction,avec une voiture ayant déjà un proprietaire 
        System.out.println(kevin.ajouter_voiture( batmobile));// et une voiture n'ayant pas de proprietaire
        //Conclusion la fonction marche pour la 2008 (qui a déjà un proprietaire on a false) et pour la batmobile on a true 

        
        
    }
    
}
