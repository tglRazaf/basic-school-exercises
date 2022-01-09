
package src.lifo_fifo;

import polymorphisme.Liste;
import src.FileDePrioriteFinal;

public class ProjetLIFO {

    // Empiler (ajout à la tete)
    // Dépiler (suprression à la tête)
    public static void demoList(Liste liste){

        liste.ajout(3);
        liste.ajout(1);
        liste.ajout(7);
        liste.ajout(12);
        liste.ajout(21);
        liste.ajout(17);

        System.out.println(liste);
        //System.out.println(liste.toString());
        
        while(!liste.estVide()){
            System.out.println(liste.extraction()+"<-"+liste);
        }

    }
  
    public static void main(String[] args) {
        
        demoList(new ListeFIFO());
        
        /*ListeLIFO liste2 = new ListeLIFO();
        
        for (int i = 0; i < 100; i++) {
            liste2.ajout((int)(Math.random()*100));
        }
        
        while(!liste2.estVide()){
            System.out.println(liste2.extraction()+"<-"+liste2);
        }*/
        
    }
    
}
