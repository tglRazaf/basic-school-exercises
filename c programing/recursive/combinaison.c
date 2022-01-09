#include <stdio.h>

int fact(int n){
    if (n==0) return 1;
    else return n*fact(n-1);
}

int combinaison(int n, int p){
    return fact(n)/(fact(p)*fact(n-p));
}

int combinaisonRecursive(int n, int p){
    if (n==p==1) return 1;
    else if (p==1) return n;    
    else return fact(n-1)/(fact(p-1)*fact((n-1)-(p-1))) + combinaisonRecursive(n-1, p);
}

int main(int argc, char const *argv[])
{
    /* code */
    int n,p;
    printf("Veuillez respecter que n>p\n");
    do
    {
        /* code */
        printf("Entrer respectivement n = ");
        scanf("%d", &n);
        printf("Entrer respectivement p = ");
        scanf("%d", &p);
    } while (n<p);
    
    printf("fact de %d! = %d\n", n, fact(n));
    printf("combinaison non recursive de %d&%d = %d\n", n, p, combinaison(n, p));
    printf("combinaison recursive de  %d&%d = %d\n", n, p, combinaisonRecursive(n, p));
    return 0;
}
