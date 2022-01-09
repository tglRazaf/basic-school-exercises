/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.lifo_fifo;

/**
 *
 * @author ANDRY-PC
 */
public class Element {
    // [Pascal]
    // valeur : integer;
    // suivant : ^Element;
    
    private int valeur;      // type 
    private Element suivant; ///Stockage d'adresse satria classe ...  

    public Element(int valeur, Element suivant) {
        this.valeur = valeur;
        this.suivant = suivant;
    }
    
    public int getValeur(){
        return valeur;
    }
    
    public Element getSuivant(){
        return suivant;
    }
    
    public void setSuivant(Element suiv){ //ilaina @FIFO
        this.suivant = suiv;
    }
}
