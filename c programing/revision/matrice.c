//AZA KAMO POR* OTRANY IO OAA KUDJ TY!!!
#include <stdio.h>
#include <stdlib.h>

struct matrice{
    int mat[50][50];
    int l, c;
};

void saisieMatrice(struct matrice* m, int c, int l){
    m->c= c;
    m->l= l;
    for (int i = 0; i < l; i++){
        for (int j = 0; j < c; j++){
            printf("mat[%d][%d] = ", i, j);
            scanf("%d", &m->mat[i][j]);
        }       
    }
}

void affichage(struct matrice* m){
    for (int i = 0; i < m->l; i++){
        for (int j = 0; j < m->c; j++){
            printf("%d\t", m->mat[i][j]);
        } 
        printf("\n");
    }
}

void transpose(struct matrice* m){
    for (int i = 0; i < m->c; i++){
        for (int j = 0; j < m->l; j++){
            printf("%d\t", m->mat[j][i]);
        } 
        printf("\n");
    }
}

int main(int argc, char const *argv[]){

    struct matrice mat;
    int *p;

    saisieMatrice(&mat, 2, 3);
    printf("------la matrice fraichement neuve-----\n");
    affichage(&mat);

    // p = (int*) mat.mat;
    // printf("%d", *(p+1));
    printf("------La transposé de la matrice-----\n");
    transpose(&mat);
    return 0;
}