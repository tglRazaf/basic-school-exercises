#include <stdio.h>

int puissanceRec(int n, int x){
    printf("rec appellé\n");
    if(x==0) 
        return 1; 
    else 
        return n * puissanceRec(n, x-1);
}


int main(int argc, char const *argv[]){
    /* code */
    printf("la puissance %d \n", puissanceRec(2, 3));
    return 0;
}
