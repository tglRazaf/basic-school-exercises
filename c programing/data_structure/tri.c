#include <stdio.h>
#include <stdlib.h>
#include <time.h>

//rand()

long t[1000];    // tableau pour stocker le tas
long tab[1000]; //tableau pour le tri a bulle
long n; // le nombre d'�l�ments
long m;
long b;
FILE *fichier;

void afficher(){
    int i;
    for (i=0;i<n;i++)
        printf("%ld\t",t[i]);
    printf("\n");
}


void afficher_complet(){
    int i;
    for (i=0;i<n;i++)
        printf("%ld,",t[i]);
    printf("---");
    for (;i<m;i++)
        printf("%ld,",t[i]);
    printf("\n");
}

void ajout_element(int x)
{
    int i;
    int temp;
    i = n;
    t[n++] = x; // post incr�mentation
                // t[n] = x;
                // n = n + 1;

    while ((i>0)&&(t[i]<t[(i-1)/2]))
    {
        temp = t[i];
        t[i] = t[(i-1)/2];
        t[(i-1)/2] = temp;
        i = (i-1)/2;
    }
   // afficher();
}

int lecture()
{
    return t[0];
}

int extraction()
{
    int sortie;
    int i, k;
    int temp;
    sortie = t[0];
    t[0] = t[--n];   // pr�-d�cr�mentation
                     // n = n - 1;
                     // t[0] = t[n];
    i = 0;           // i -> racine
    k = 1;           // k -> fg de la racine

    // on veut placer k sur le fils le plus prioritaire

    if ((k+1<n)&&(t[k+1]<t[k]))
        k++; // le fd est prioritaire par rapport au fils gauche

    // k est l'indice du plus petit fils

    while ((k<n)&&(t[k]<t[i])) // tant qu'il y a un fils
                               // et qu'il y a un fils prioritaire par rapport � i
    {
        temp = t[k];
        t[k] = t[i];
        t[i] = temp;
        i = k;
        k = i*2+1; // k est sur le fils gauche de i
        if ((k+1<n)&&(t[k+1]<t[k]))
            k++; // le fils droit est prioritaire par rapport au fils gauche
        // k est l'indice du plus petit fils
    }

    return sortie; //renvoie la valeur de sortie et quitte le sous-programme

}

int tas_vide()
{
    if (n==0) return 1;
    else return 0;  // il n'est obligatoire de mettre 'else', car 'return' FORCE la
                    // fin de l'execution du sous-programme (fonction)
    // return (n==0);
}

void saisie()
{
    int i;
    printf("entrer le nombre d'�l�ments");
    scanf("%ld",&m);
    b=m;
    for (i=0;i<b;i++){
        t[i]= rand()%1000;
        tab[i]= rand()%1000;
    }
    n = 0;
    //afficher_complet();
}

int tri_a_buller(){
    int i,j, tmp;
    for ( i = 0; i < b; i++)
    {
        for ( j = 0+i; j < b; j++)
        {
            if(tab[i]>tab[j]){
                tmp= tab[i];
                tab[i]= tab[j];
                tab[j]= tmp;
            }
        }
        
    }
    return 0;
}

void entassement()
{
    int i;
    for (i=0;i<m;i++){
        ajout_element(t[i]);
    }
}

void detassement()
{
    m = n;
    while (n>0)
    {
        t[n-1] = extraction();
    }
}


int main()
{
    int trie[1000];
    int n_trie;
    int j, x;
    n_trie = 0;
    clock_t t1, t2, t3;
    int nbr = 50;

    fichier= fopen("/home/stephano/Documents/c programing/fichier.txt", "r+");
    fprintf(fichier, "nombre ; tri par tas ; autre tri ;\n");

/*
    while(!tas_vide())
    {
        trie[n_trie++] = extraction();
    }

    for (j = 0; j<n_trie; j++)
        printf("%s%d",j==0 ? "":", ",trie[j]);
        */

    // tri par tas in situ, avec complexit� O(nlog(n))
    for ( x = 0; x < nbr; x++)
    {
        printf("teste 1 marche\n");
        saisie();
        entassement();
        t1= clock();
        detassement();
        t2= clock();
        tri_a_buller();
        t3= clock();
        fprintf(fichier, "%ld;%f;%f\n", b, ((t2-t1)*1000)/(double)CLOCKS_PER_SEC,  ((t3-t2)*1000)/(double)CLOCKS_PER_SEC);
        // printf("\n ====tri par tas%f en milliseconde====\n", ((t2-t1)*1000)/(double)CLOCKS_PER_SEC);
        // printf("\n ====tri à bulle%f en milliseconde====\n", ((t3-t2)*1000)/(double)CLOCKS_PER_SEC);
    }
    
    
    
    fclose(fichier);

}
