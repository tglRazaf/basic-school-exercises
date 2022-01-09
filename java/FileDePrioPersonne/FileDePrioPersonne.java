package FileDePrioPersonne;
import heritageExo.Etudiant;
import heritageExo.Personne;

public class FileDePrioPersonne {
    
    private Personne []tab; //private: visible uniquement dans FileDePrioPersonne
    private int n;
    private int alpha;

    public FileDePrioPersonne(int capacite, boolean isRmax) { // public : visible partout
        tab = new Personne[capacite];
        n = 0;
        alpha = isRmax ? -1 : 1;
    }
    
    public FileDePrioPersonne(int capacite) { // public : visible partout
        this(capacite, false);
    }
    
    private void permut(int p1, int p2){
        Personne tmp = tab[p1];
        tab[p1] = tab[p2];
        tab[p2] = tmp;
    }
    
    
    //
    // public int comparer(int age1, int age2){
    //     return (age1 - age2)*alpha;
    // }
    
    
    public boolean ajout(Personne nouv){
        if (n>=tab.length) return false; /// feno ilay tabilao ^^ 
        tab[n++] = nouv;
        int i=n-1;
        while (i>0&& tab[i].comparer(tab[(i-1)/2], this.alpha)<0){ // R_min, indice de départ 0;
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
    
    public Personne lecture(){
        return tab[0];
    }
    
    public Personne extraction(){
        Personne tmp = tab[0];
        tab[0] = tab[--n];
        int i=0, k = 1;
        if (k+1<n && tab[k+1].comparer(tab[k], this.alpha)<0) // comparaison des deux 
                                    // fils si le fils droit existe
            k++;
        // k représente l'indice du plus petit fils
        while (k<n && tab[k].comparer(tab[k+1], this.alpha)<0){
            permut(k,i);
            i = k;
            k = k*2+1; //merci
            if (k+1<n && tab[k+1].comparer(tab[k], this.alpha)<0) k++;
        }
        return tmp;
    }
    
    public int getNbElements(){
        return n;
    }
    
    public static void main(String[] args) {
        FileDePrioPersonne fp = new FileDePrioPersonne(100, true);
        Personne p1 = new Personne("Stephano", "Razafy", 12, true);
        Personne p2 = new Personne("Faneva", "Rak", 45, true);
        Personne p3 = new Personne("Mahery", "Ral", 36, true);
        Personne p4 = new Personne("Donah", "Namb", 21, true);
        Personne p5 = new Personne("Ifaliana", "Lin", 3, true);
        Personne p6 = new Personne("Tsiory", "Hery", 80, true);
        fp.ajout(p1);
        fp.ajout(p2);
        fp.ajout(p3);
        fp.ajout(p4);
        fp.ajout(p5);
        fp.ajout(p6);
        while (!fp.estVide()){
            System.out.println(fp.extraction());
        }
    }
    
}
