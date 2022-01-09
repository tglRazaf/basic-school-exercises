#include <stdio.h>
#include <stdlib.h>

int t[100]; // tableau pour stocker le tas
int n; // le nombre d'�l�ments

void afficher(){
    int i;
    for (i=0;i<n;i++)
        printf("%d\t",t[i]);
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
    afficher();
}

/*int lecture()
{
    return t[0];
}
*/
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
            k++; // le fd est prioritaire par rapport au fils gauche
    }



    return sortie; //renvoie la valeur de sortie et quitte le sous-programme

}

int main()
{
    n = 0;
    ajout_element(1);
    ajout_element(0);
    /*ajout_element(5);
    ajout_element(0);
    ajout_element(2);*/

    /*printf("(%d) <- \n", extraction()); afficher();
    printf("(%d) <- \n", extraction()); afficher();
    printf("(%d) <- \n", extraction()); afficher();
    printf("(%d) <- \n", extraction()); afficher();
    */
}
