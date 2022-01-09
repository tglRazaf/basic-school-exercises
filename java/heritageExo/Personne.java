package heritageExo;

public class Personne {
    
    private String nom;
    private String prenom;
    private int age;
    private boolean isMasculin;

    public Personne(){
        this.nom = "Raza";
        this.prenom = "stephano";
        this.age = 12;
        this.isMasculin = true;
    }

    public Personne(String nom, String prenom, int age, boolean isMasculin) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.isMasculin = isMasculin;
    }
    
    public String getName(){
        return this.nom;
    }

    public String getSexe(){
        return isMasculin ? "Masculin" : "Féminin";
    }

    public int getAge(){
        return this.age;
    }

    public void affiche(){
        System.out.println("Personne{" + "nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", sexe=" + getSexe() + '}');
    }
    
    public void presentation(){
        System.out.println("Je me présente : ");
        affiche(); // polymorphisme
    }

    // public int comparer(Personne p, int alpha){
    //     return (this.age - p.age)*alpha;
    // }

    public int comparer(Personne p, int alpha){
        return this.getName().compareTo(p.getName())*alpha;
    }

    public String toString(){
        return "vous êtes maintenant dans une instace de Personne : "+this.nom;
    }
}
