import java.util.Scanner;

public class exercice {

    public static class Complexe {
        int im;
        int re;
        public static void affiche(Complexe z) {
            System.out.println("Le complexe est = ");
        }
        public static String somme(Complexe z1, Complexe z2){
            int re=z1.re + z2.re;
            int im=z1.im + z2.im;
            return ""+re+" + "+im+"i";
        }
        public static String produit(Complexe z1, Complexe z2) {
            int re=(z1.re * z2.re) -(z1.im*z2.im);
            int im=(z1.re * z2.im) + (z1.im*z2.re);
            return ""+re+" + "+im+"i";
        }
    }
    public static void main(String[] args) {
        Complexe z1, z2;
        z1= new Complexe();
        z2= new Complexe();
        z1.re= 5; z1.im= 3;
        z2.re= 3; z2.im= 9;
        System.out.println("la somme de z1 avec z2 complexe = " + z2.somme(z1, z2));
        System.out.println("le produit de z1 avec z2 complexe = " + z2.produit(z1, z2));
    }
}
