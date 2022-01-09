package heritageExo;

public class Etudiant extends Personne{

    protected int number;
    protected String classe;
    protected double moyenne;
    
    public Etudiant(){
        super();
        this.number= 0;
        this.classe= "";
        this.moyenne= 2.2;
    }

    public Etudiant(String name, String firstName, int age, boolean isMasculin, int number, String classe, Double moyenne){
        super(name, firstName, age, isMasculin);
        this.number= number;
        this.classe= classe;
        this.moyenne= moyenne;
    }
        
    @Override
    public void affiche(){
        System.out.println("-------version affichage etudiant---------");
        super.affiche();
    }

    //redefinition du methode de comparaison en fonction du type de la class
    @Override
    public int comparer(Personne p, int alpha){
        return (int)(this.moyenne - p.getAge())*alpha;
    }

    public static void main(String[] args) {
        Etudiant etu1 = new Etudiant("stephano", "sama", 20, true, 10, "ISAIA 2", 15.3);
        String mathieu = "mathieu";

        System.out.println(mathieu.compareTo("donah"));
        System.out.println(etu1.getName());
    }
}