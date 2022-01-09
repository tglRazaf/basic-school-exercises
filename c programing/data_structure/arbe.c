#include <stdio.h>
#include <stdlib.h>

int t[100];
int tri[100];
int n;

int saisie(int x){
    int i, temp;
    i= n;
    t[n++]= x;
    while ((i>0)&&(t[i]<t[(i-1)/2]))
    {
        temp = t[i];
        t[i] = t[(i-1)/2];
        t[(i-1)/2] = temp;
        i = (i-1)/2;
    }
    return 0;
}

int extraction(){
    int i, tmp, k, sortie;
    i= 0;
    sortie= t[i];
    t[i]= t[--n];
    k=1;

    if ((k+1<n) && (t[k]>t[k+1]))
        k++;

    while ((k<n)&&(t[k]<t[i]))
    {
        tmp= t[i];
        t[i]= t[k];
        t[k]= tmp;
        i= k;
        k= (i*2)+1;
        if (t[k]>t[k+1])
            k++;
    }
    
    return sortie;

}

void affichage(n){
    int i;
    for ( i = 0; i < n; i++)
    {
        printf("%d|", t[i]);
    }
}


int main()
{
    
    long i;
    n= 0;

    for ( i = 0; i < 10000; i++)
    {
        saisie(rand()%1000);
    }
    printf("\narbre : \n");
    affichage(n);
    printf("\ntas ordonné : \n");
    for ( i = 0; i < 10000; i++)
    {
        tri[i]= extraction();
        printf("%d|", tri[i]);
    }
    printf("\n");
    return 0;
}
