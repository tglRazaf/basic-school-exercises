#include <stdio.h>
#include <stdlib.h>
#include <math.h>

/*double isCube(int nbr){
    int u, d, c;
    float s;

    u= (nbr%10);
    d= (nbr%100)/10;
    c= (nbr/100);

    s= pow(u, 3);

    return s;
}*/

int main()
{
    int u, d, c, nbr;
    float s;
    nbr= 153;

    u= (nbr%10);
    d= (nbr%100)/10;
    c= (nbr/100);

    //s= pow(u, 3);

    printf("%f", pow(u, 3));
    
    return 0;
}
