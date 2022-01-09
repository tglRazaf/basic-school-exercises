
package src;

public class Etudiant extends Personne{
    private String parcours;
    private int niveau;

    public Etudiant(String parcours, int niveau, String nom, String prenom, int age, boolean isMasculin) {
        super(nom, prenom, age, isMasculin); //Constructeur Superclasse - Tsy maintsy VOLOU
        this.parcours = parcours;
        this.niveau = niveau;
    }
    
    
    @Override //redéfinition de méthode
    public void affiche(){
        System.out.println("-----(version etudiant)-----");
        super.affiche();
        System.out.println("Classe : "+getClasse());
    }
    
   
    
    public String getClasse(){
        return parcours+" "+niveau;
    }
    
    
}
