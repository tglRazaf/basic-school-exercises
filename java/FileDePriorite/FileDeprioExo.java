package FileDePriorite;
public class FileDeprioExo {
    private int []tab; // private: visible uniquement dans la classe FileDePriorite
    private int n;
    public boolean isRmin;
    private int alpha;

    public FileDeprioExo(int capacite, boolean isRmin) { // public : visible partout
        tab = new int[capacite];
        n = 0;
        this.isRmin= isRmin;
        if(isRmin) this.alpha = 1; else this.alpha= -1;
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
        while (i>0&&this.alpha*tab[i]<this.alpha*tab[(i-1)/2]){ // R_min, indice de départ 0;
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
        if (k+1<n&&this.alpha*tab[k+1]<this.alpha*tab[k]) // comparaison des deux 
                                // fils si le fils droit existe
        k++;
        while (k<n&&this.alpha*tab[k]<this.alpha*tab[i]){
            permut(k,i);
            i = k;
            k = k*2+1; 
            if (k+1<n&&this.alpha*tab[k+1]<this.alpha*tab[k]) k++;
        }
        // k représente l'indice du plus petit fils
        return tmp;
    }
    
    public int getNbElements(){
        return n;
    }

    public void affiche(){
        for (int i = 0; i < n; i++) {
            System.out.println(tab[i]);
        }
    }
    
    public static void main(String[] args) {
        FileDeprioExo fp = new FileDeprioExo(100, true);
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
        FileDeprioExo fp2 = new FileDeprioExo(100, false);
        fp2.ajout(14);
        fp2.ajout(0);
        fp2.ajout(17);
        fp2.ajout(20);
        fp2.ajout(95);
        fp2.ajout(112);
        while (!fp2.estVide()){
            System.out.println(fp2.extraction());
        }
    }
}