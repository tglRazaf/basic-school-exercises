#include <stdio.h>


int insertion(int *tab, int dim){
    int i;
    for (i = 0; i < dim; i++){
        /* code */
        printf("tab[%d] = ", i);
        scanf("%d", tab+i);
    }
    return 0;
}

void affichage(int *tab, int dim){
    if (dim==0)
        printf("\n");
    else {printf("%d\t", *tab+dim-1); affichage(tab, dim-1);}
}

int main(int argc, char const *argv[])
{
    /* code */
    int tab[50];
    insertion(tab, 5);
    affichage(tab, 5);
    return 0;
}
