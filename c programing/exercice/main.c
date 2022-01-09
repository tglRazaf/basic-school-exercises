#include <stdio.h>
#include <stdlib.h>
#include <math.h>

/*int isCube(int nbr){
    int u, d, c;
    float s;

    u= (nbr%10);
    d= (nbr%100)/10;
    c= (nbr/100);
    s= (pow(u, 3) + pow(d, 3) + pow(c, 3));

    return (nbr == s);
}
*/
int main()
{
    int a, b, c, fact, i, puis, cpt, u, d;
    int s;
    //exercice 1
    /*
    a= 0; b= 0; c=0;
    while (!a || !b || !c)
    {
        printf("Entrer a = ");
        scanf("%d", &a);
        printf("Entrer b = ");
        scanf("%d", &b);
        printf("Entrer c = ");
        scanf("%d", &c);
    }
    for ( ; !a || !b || !c; )
    {
        printf("Entrer a = ");
        scanf("%d", &a);
        printf("Entrer b = ");
        scanf("%d", &b);
        printf("Entrer c = ");
        scanf("%d", &c);
    }
    */
    do{
        printf("Entrer a = ");
        scanf("%d", &a);
        printf("Entrer b = ");
        scanf("%d", &b);
        printf("Entrer c = ");
        scanf("%d", &c);
    }while(!a || !b || !c);
    printf("la somme = %d\n", a+b+c);
    printf("le produit = %d\n", a*b*c);
    printf("la moyenne = %.2f\n", (double)(a+b+c)/3);

    //exercice 2 (factorielle)
    i=1;
    fact= i;
    /*while (i<=a)
    {
        fact= fact *i;
        i++;
    }*/
    for ( ; i <= a; i++)
        fact= fact *i;
    printf("fact de a = %d\n", fact);

    //exercice 3 : exemple a puis b
    puis= 1;
    for ( i = 0; i < b; i++)
        puis= puis*a;
    printf("%d puissance %d = %d\n", a, b, puis);

    //exercice 4: PDCD


    //exercice 5: nombre premier ex: a
    cpt= 0;
    for ( i = 2; i <= a/2; i++)
    {
        if (!(a% i))
        {
            cpt++;
            if (cpt>0)
                printf("diviseur : %d\n", i);
        }
    }
    if (!cpt)
        printf("a est premier\n");

    //exercice 6: nombre cube
    u= (a%10);
    d= (a%100)/10;
    c= (a/100);
    printf("%lf", pow(a,3));
    s= 122;
    if (a== s)
        printf("%d est cube\n\n", a);
    else printf("%d n'est pas cube\n\n", a);
    return 0;
}
