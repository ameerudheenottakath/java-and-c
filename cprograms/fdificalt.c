#include <stdio.h>
void main(){
    for(int i=1;i<=4;i++){
        for(int j=1;j<=3*i-1;j++){
            printf("*");
        }
        printf("\n");
        if(i==4){
            break;
        }
        for(int k=1;k<=i;k++){
            for(int l=1;l<=i;l++)
           
            printf("* ");
           
        }
        printf("\n");
    }
}