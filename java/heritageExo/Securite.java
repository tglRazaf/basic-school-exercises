
package heritageExo;

public class Securite extends Personne {
    private int numero;
    private boolean isCool;

    Securite(String name, String firstName, int age, boolean isMasculin, int numero, boolean isCool){
        super(name, firstName, age, isMasculin);
        this.numero= numero;
        this.isCool= isCool;
    }

    @Override
    public int comparer(Personne p, int alpha){
        return super.getName().compareTo(p.getName())*alpha;
    }
}
