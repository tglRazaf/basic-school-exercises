package FileDePriorite;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package filedepriorite;

public class FileDePriorite {
    private int []tab; // private: visible uniquement dans la classe FileDePriorite
    private int n;

    public FileDePriorite(int capacite) { // public : visible partout
        tab = new int[capacite];
        n = 0;
    }
    
    private void permut(int p1, int p2){
        int tmp = tab[p1];
        tab[p1] = tab[p2];
        tab[p2] = tmp;
    }
    
    public boolean ajout(int nouv){
        if (n>=tab.length) return false; /// feno ilay tabilao ^^ 
        tab[n++] = nouv;
        int i=n-1;
        while (i>0&&tab[i]<tab[(i-1)/2]){ // R_min, indice de départ 0;
            permut(i,(i-1)/2);
            i = (i-1)/2;
        }
        return true;
    }
    
    public boolean estVide(){
       /* if (n<=0) return true;
        else return false;*/
       return n<=0;
    }
    
    public int lecture(){
        return tab[0];
    }
    
    public int extraction(){
        int tmp = tab[0];
        tab[0] = tab[--n];
        int i=0, k = 1;
        if (k+1<n&&tab[k+1]<tab[k]) // comparaison des deux 
                                    // fils si le fils droit existe
            k++;
        // k représente l'indice du plus petit fils
        while (k<n&&tab[k]<tab[i]){
            permut(k,i);
            i = k;
            k = k*2+1; 
            if (k+1<n&&tab[k+1]<tab[k]) k++;
        }
        return tmp;
    }
    
    public int getNbElements(){
        return n;
    }
    
    public static void main(String[] args) {
        FileDePriorite fp = new FileDePriorite(100);
        fp.ajout(14);
        fp.ajout(0);
        fp.ajout(17);
        fp.ajout(20);
        fp.ajout(95);
        fp.ajout(112);
        while (!fp.estVide()){
            System.out.println(fp.extraction());
        }
        
        System.out.println("deuxième file de priorité");
        FileDePriorite fp2 = new FileDePriorite(100);
        fp2.ajout(96);
        fp2.ajout(14);
        fp2.ajout(11420);
        fp2.ajout(147);
        fp2.ajout(2201);
        while (!fp2.estVide()){
            System.out.println(fp2.extraction());
        }
    }
    
}
