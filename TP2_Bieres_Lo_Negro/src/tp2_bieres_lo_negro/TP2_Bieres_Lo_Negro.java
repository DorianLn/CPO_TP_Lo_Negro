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
        
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",
        7.0 ,"Dubuisson") ;
        uneBiere.lireEtiquette();

        BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6
        ,"Abbaye de Leffe") ;
        autreBiere.lireEtiquette();
        
        BouteilleBiere desperados = new BouteilleBiere("desperados", 5.9
        ,"heineken") ;
        desperados.lireEtiquette();
        
        BouteilleBiere skol = new BouteilleBiere("skol", 6
        ,"Strassen") ;
        skol.lireEtiquette();
        
        BouteilleBiere grimbergen = new BouteilleBiere("grimbergen", 6.7
        ," Brasseries Kronenbourg") ;
        grimbergen.lireEtiquette();
        
        System.out.println(uneBiere.Décapsuler());
        
        BouteilleBiere chimay  = new BouteilleBiere("chimay ", 8
        ," Brasseries de Chiamy") ;
        chimay.lireEtiquette();
        System.out.println(chimay.Décapsuler());
        
        BouteilleBiere pietra  = new BouteilleBiere("pietra ", 5.5
        ," Brasseries de pietra") ;
        pietra.lireEtiquette();
        System.out.println(pietra.Décapsuler());

    }
    
}
