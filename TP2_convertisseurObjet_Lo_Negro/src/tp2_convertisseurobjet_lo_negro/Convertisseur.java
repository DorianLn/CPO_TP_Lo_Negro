/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_lo_negro;

/**
 *
 * @author doria
 */
public class Convertisseur {
    double CversK;//on met un nombre à décimal
    double KversC;
    double FversK;
    double KversF;
    double CversF;
    double FversC;
    int nbConversions; 
    
    public Convertisseur(){
        nbConversions = 0 ;
    }
    
    public double CelciusVersKelvin(double CK){//on calcul un Celcius en Kelvin et on retourne le resulat
        CversK=CK+273.15;
        
        return CversK;
    }
    
    public double KelvinVersCelcius(double KC){
        KversC=KC-273.15;
        return KversC;
    }
    
    public double FarenheitVersCelcius(double FC){
        FversC=FC/33.8;
        return FversC;        
        
    }
    
    public double CelciusVersFarenheit(double CF){
        CversF=CF*33.8;
        return CversF;
        
    }
    
    public double KelvinVersFarenheit(double KF){
        KversF=(KF-273.15)*33.8;
        return KversF;
        
    }
    
    public double FarenheitVersKelvin(double FK){
        FversK=(FK/33.8)+273.15;
        return FversK;
        
    }
    
}
