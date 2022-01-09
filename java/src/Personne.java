
package src;

public class Personne {
    private String nom;
    private String prenom;
    private int age;
    private boolean isMasculin;

    public Personne(String nom, String prenom, int age, boolean isMasculin) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.isMasculin = isMasculin;
    }
    
    public String getSexe(){
        return isMasculin ? "Masculin" : "Féminin";
    }

    public void affiche(){
        System.out.println("Personne{" + "nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", sexe=" + getSexe() + '}');

    }
    
    public void presentation(){
        System.out.println("Je me présente : ");
        affiche(); // polymorphisme
    }
}
