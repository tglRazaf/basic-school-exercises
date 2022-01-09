#include <stdio.h>
#include <stdlib.h>

int main(int argc, char const *argv[])
{
    int i, j, k, cas;
    // cas= 0;
    // for(i=0; i<=5; i++){
    //     j=0;
    //     for ( ; j <=10; j++)
    //     {
    //         k=0;
    //         for ( ; k <=20 ; k++)
    //             if((20*i) + (10*j) + (5*k) == 100){
    //                 printf("20AR*%d + 10AR*%d + 5AR*%d\n", i, j, k);
    //                 cas++;
    //             } 
    //     }
    // }

    for ( i = 0; i <= 100; i++)
    {
        j=0;
        for (; j <= 200; j++)
        {
            k=0;
            for (; k <= 500; k++)
            {
                if ((5000*i)+(2500*j)+(1000*k)==500000)
                {
                    printf("%d de billet de 5000\t %d de billet de 2500\t %d de billet de 1000\t\n", i, j, k);
                }
                
            }
            
        }
        
    }
    
    //printf("====%d cas possible====\n", cas);
    return 0;
}
