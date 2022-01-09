
package src;

import polymorphisme.Liste;

public class FileDePrioriteFinal implements Liste {
    
    private int []tab; //private: visible uniquement dans FileDePrioriteFinal
    private int n;
    private int alpha;

    public FileDePrioriteFinal(int capacite, boolean isRmax) { // public : visible partout
        tab = new int[capacite];
        n = 0;
        alpha = isRmax ? -1 : 1;
    }
    
    public FileDePrioriteFinal(int capacite) { // public : visible partout
        this(capacite, false);
    }
    
    private void permut(int p1, int p2){
        int tmp = tab[p1];
        tab[p1] = tab[p2];
        tab[p2] = tmp;
    }
    
    
    //
    public int comparer(int i1, int i2){
        return (i1-i2)*alpha;
    }
    
    @Override
    public void ajout(int nouvVal){
        //if (n>=tab.length) return false; /// feno ilay tabilao ^^ 
        tab[n++] = nouvVal;
        int i=n-1;
        while (i>0&&comparer(tab[i],tab[(i-1)/2])<0){ // R_min, indice de départ 0;
            permut(i,(i-1)/2);
            i = (i-1)/2;
        }
        //return true;
    }
    
    @Override
    public boolean estVide(){
       /* if (n<=0) return true;
        else return false;*/
       return n<=0;
    }
    
    public int lecture(){
        return tab[0];
    }
    
    @Override
    public int extraction(){
        int tmp = tab[0];
        tab[0] = tab[--n];
        int i=0, k = 1;
        if (k+1<n&&comparer(tab[k+1],tab[k])<0) // comparaison des deux 
                                    // fils si le fils droit existe
            k++;
        // k représente l'indice du plus petit fils
        while (k<n&&comparer(tab[k],tab[i])<0){
            permut(k,i);
            i = k;
            k = k*2+1; //merci
            if (k+1<n&&comparer(tab[k+1],tab[k])<0) k++;
        }
        return tmp;
    }
    
    public int getNbElements(){
        return n;
    }
    
    @Override
    public String toString(){
        String out = "[";
        if (n==0) return "[]";
        for (int i = 0; i < n; i++) {
            out += tab[i] + ", ";
            if(i==n) out += " ]"; else out += "";
        }
        return out;
    }

    public static void main(String[] args) {
        FileDePrioriteFinal fp = new FileDePrioriteFinal(100);
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
        FileDePrioriteFinal fp2 = new FileDePrioriteFinal(100,true);
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
