package src.lifo_fifo;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ANDRY-PC
 */

 // FIFO
 // Ajout - Enfiler (ajout à la queue)
 // Extraction - Défiler (suprression à la tête)

public class ListeFIFO extends ListeLIFO{
    private Element queue;
    public ListeFIFO(){
        super();
        queue = null;
    }
    // Ajout - Enfiler (ajout à la queue), nouvelle version
    @Override
    public void ajout(int nouvVal){
        if(estVide()){
            super.ajout(nouvVal);
            this.queue = this.tete;
        }else{
            this.queue.setSuivant(new Element(nouvVal, null));
            this.queue = this.queue.getSuivant();
        }
    }
}
