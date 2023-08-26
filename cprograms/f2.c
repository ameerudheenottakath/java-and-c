#include <stdio.h>
void main(){
    for(int i=3;i>=1;i--){
        for(int j=1;j<=2*i;j++){
            printf("X");
        }
        printf("\n");
        for(int k=1;k<=1;k++){
            printf("X\n");
        }
    }
}