/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_lo_negro;

/**
 *
 * @author doria
 */
public class TP2_Bieres_Lo_Negro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",// création d'un nouvelle objet (uneBiere)
        7.0 ,"Dubuisson") ;
        uneBiere.lireEtiquette();// on affiche les caractéristiques à l'aide de la méthode public void 

        BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6
        ,"Abbaye de Leffe") ;// création d'un nouvelle objet (autreBiere)
        autreBiere.lireEtiquette();
        
        BouteilleBiere desperados = new BouteilleBiere("desperados", 5.9
        ,"heineken") ;// création d'un nouvelle objet desperados
        desperados.lireEtiquette();
        
        BouteilleBiere skol = new BouteilleBiere("skol", 6
        ,"Strassen") ;// création d'un nouvelle objet skol
        skol.lireEtiquette();
        
        BouteilleBiere grimbergen = new BouteilleBiere("grimbergen", 6.7
        ," Brasseries Kronenbourg") ;// création d'un nouvelle objet grimbergen
        grimbergen.lireEtiquette();
        
        System.out.println(uneBiere.Décapsuler());// on decapsule uneBiere si ce n'est pas déjà fait 
        
        BouteilleBiere chimay  = new BouteilleBiere("chimay ", 8
        ," Brasseries de Chiamy") ;// création d'un nouvelle objet chimay
        chimay.lireEtiquette();
        System.out.println(chimay.Décapsuler());// on decapsule chimay à l'aide de la fonction Décapsuler
        
        BouteilleBiere pietra  = new BouteilleBiere("pietra ", 5.5
        ," Brasseries de pietra") ;// création d'un nouvelle objet pietra
        pietra.lireEtiquette();
        System.out.println(pietra.Décapsuler());// on decapsule la pietra  à l'aide de la fonction Décapsuler

    }
    
}
