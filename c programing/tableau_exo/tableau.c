#include <stdio.h>
#include <stdlib.h>

int tab[50];
int n;

void afficher(int n, int t[]){
    int i;
    for ( i = 0; i < n; i++)
        printf("tab[%d] = %d\t", i, t[i]);
    printf("\n");
}

int somme(int n, int t[]){
    int i, s;
    s= 0;
    for ( i = 0; i < n; i++)
        s= s+ t[i];
    return s;
}

int produit(int n, int t[]){
    int i, p;
    p= 1;
    for ( i = 0; i < n; i++)
        p= p* t[i];
    return p;
}

int moyenne(int n, int t[]){
    int i, m;
    return somme(n, t)/n;
}

int tasser(){
    int i, j;
    for ( i = 0; i < n; i++)
    {
        if(tab[i]==0){
            for ( j = i; j < n; j++)
                tab[j]= tab[j+1];
            n--;
            i--;
        }
    }
    
    return 0;
}

int ranger(){
    int i, j;
    for (j= 0, i= n-1; j< n/2; j++, i--)
    {
        tab[j]= tab[j]+ tab[i];
        tab[i]= tab[j]- tab[i];
        tab[j]= tab[j]- tab[i];
    }
    return 0;   
}

int main(int argc, char const *argv[])
{
    int i;

    do{
        printf("Entrer la dimension du tableau = ");
        scanf("%d", &n);
    }while(n<0 || n>50);

    for ( i = 0; i < n; i++)
    {
        printf("tab[%d] = ", i);
        scanf("%d", tab+i);
    }
    printf("tableau apres insertion : \n");
    afficher(n, tab);
    printf("somme = %d\t produit = %d\t moyenne = %d\n", somme(n, tab), produit(n, tab), moyenne(n, tab));
    ranger();
    printf("tableau rangé à l'inverse de l'ordre d'insertion : \n");
    afficher(n, tab);
    tasser();
    printf("tableau sans la valeur 0 : \n");
    afficher(n, tab);
    return 0;
}
