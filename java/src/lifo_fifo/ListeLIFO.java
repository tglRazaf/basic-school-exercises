/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.lifo_fifo;

import polymorphisme.Liste;

/**
 *
 * @author ANDRY-PC
 */
public class ListeLIFO implements Liste{
    protected Element tete;
    private int nbr;
    public ListeLIFO(){
        this.tete = null;
        nbr = 0;
    }
    
    @Override
    public void ajout(int nouvVal){
      /*  Element pn = new Element(nouvVal, tete);
        tete = pn;*/
        tete = new Element(nouvVal, tete); 
        nbr ++;
    }
    
    @Override
    public int extraction() {
        int val = tete.getValeur();
        tete = tete.getSuivant();
        nbr --;
        return val;
    }
    
    @Override
    public boolean estVide(){
        return tete == null; 
        //if (tete==null) return true; else return false;
    }
    
    @Override 
    public String toString(){     
       
        String out = "[";
        Element p = tete;
        if (p==null) return "[]";
        while(p!=null){
            out = out + (p.getValeur()+(p.getSuivant()!=null ? ", " : "]"));
            p = p.getSuivant(); // p := p^.suivant;
        }
        return out;
    }
    
    //implémentation de l'évaluation du nombre d'éléments
    
    public int nbElem(){
        int nb = 0;
        Element p = tete;
        while (p!=null){
            nb++;
            p = p.getSuivant();
        }
        return nb;
    }
    
     public int nbElemRapide(){
        return nbr;
    }

    public Element getTete() {
        return tete;
    }

    public void setTete(Element tete) {
        this.tete = tete;
    }

    public int getNbr() {
        return nbr;
    }

    public void setNbr(int nbr) {
        this.nbr = nbr;
    }
}
