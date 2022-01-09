#include <stdio.h>
#include <stdlib.h>

int main()
{
    int i, k, j, premierStars, n;
    char c;
    /*printf("etrer votre forme de triangle : ");
    c= getchar();*/
    printf("logueur : ");
    scanf("%d", &n);
    n*=2;
    premierStars= n/2;
    for ( i = 0; i <= n/2; i++)
    {
        
        j= (n/2)+ i;
        for ( k = 0; k <= j; k++)
        {
            if(j==n/2)
                (k== premierStars)? printf("*"): printf(" ");
            else
                (k>=premierStars && k<=j)? printf("*"): printf(" ");
                
        }
        printf("\n");
        premierStars--;
    }
    printf("\n");
    return 0;
}
