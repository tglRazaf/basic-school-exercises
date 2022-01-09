import java.util.Scanner;

class Hello{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tab[] = new int[6];
        int tmp;
        for (int i = 0; i < tab.length; i++) {
            System.out.print("tab["+i+"] = ");
            tab[i]= sc.nextInt();
        }
        System.out.println("le tableau avant le triage : ");
        for (int i = 0; i < tab.length; i++) {
            System.out.print("|"+tab[i]);
        }
        for (int i = 0; i < tab.length; i++) {
            for (int j = i+1; j < tab.length; j++) {
                if(tab[i]>tab[j]){
                    tmp= tab[i];
                    tab[i]= tab[j];
                    tab[j]= tmp;
                }
            }
        }
        System.out.println("le tableau après le triage : ");
        for (int i = 0; i < tab.length; i++) {
            System.out.print("|"+tab[i]);
        }
    }
}