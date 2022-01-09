#include <stdio.h>

struct tableau{
    int tab[50];    
    int dim;
};

void saisie(struct tableau* tab, int dim){
    tab->dim = dim;
    for (int i = 0; i < tab->dim; i++){
        printf("Entrer tab[%d] = ", i);
        scanf("%d", &tab->tab[i]);
    }
}

void affichage(struct tableau* tab){
    for (int i = 0; i < tab->dim; i++)
        printf("%d |", tab->tab[i]);
    printf("\n");
}

int tasser(struct tableau* tab, int nbr){
    int i, j, tmp;

    for ( i = 0; i < tab->dim; i++){
        if (tab->tab[i] == nbr){
            for ( j = i; j < tab->dim; j++)
                tab->tab[j] = tab->tab[j+1];
            tab->dim--;
        }
        (tab->tab[i] == nbr)? i-- : i;
    }
    return tab->dim;
}

int main(int argc, char const *argv[]){
    
    struct tableau tab;
    
    saisie(&tab, 5);
    affichage(&tab);
    tasser(&tab, 0);
    affichage(&tab);
    return 0;
}
