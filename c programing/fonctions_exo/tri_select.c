#include <stdio.h>

int nbrc(long nbr){
    int n = 1;
    while (nbr/10>0){
        nbr=nbr/10;
        n++;
    }
    return n;
}

int maxTab1(int *t, int dim){
    int max, i;
    max= *t;
    for ( i = 0; i < dim; i++){
        if (max<*(t+i))
            max= *(t+i);                
    }
    return max;
}

int maxTab2(int *t, int dim){
    int max, i;
    max= 0;
    for ( i = 0; i < dim; i++){
        if (t[max]<*(t+i))
            max= i;                
    }
    return max+1;
}

long maxTab3(int *t, int dim){
    int *max;
    int i;
    max= t;
    for ( i = 0; i < dim; i++){
        if (*max<*(t+i))
            max= t+i;                
    }
    return max;
}

void echange(int *n1, int *n2){
    int tmp;
    tmp= *n1;
    *n1= *n2;
    *n2= tmp;
}

void triSelect(int *tab, int dim){
    int i;
    for ( i = dim-1; i >= 0; i--){
        echange(tab+i, maxTab3(tab, i));
    }
}

void afficher(int *tab, int dim){
    int i;
    for ( i = 0; i < dim; i++)
        printf("\t%d", *(tab+i));
    printf("\n");
}

int main(int argc, char const *argv[]){
    int tab[5] = {2, 10, 23, 0, 4};
    int *p, i;
    long n = 124560146444;
    p= tab+2;
    printf("le nombre = %d\n", nbrc(n));
    printf("Le max dans le tableau tab = %d\n", maxTab1(tab, 5));
    printf("L'indice de l'element max = %d\n", maxTab2(tab, 5));
    printf("L'adresse de l'element max = %ld\n", maxTab3(tab, 5));
    printf("verification = %ld\n", p);
    printf("tableau avant triage : \n");
    afficher(tab, 5);
    triSelect(tab, 5);
    printf("tableau après triage : \n");
    afficher(tab, 5);
    return 0;
}