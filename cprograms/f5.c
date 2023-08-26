#include <stdio.h>
void main(){
    for(int i=1;i<=3;i++){
      for(int j=1;j<=2*i-1;j++){
            printf("* ");
        } 
        printf("\n");
        for(int k=1;k<=i;k++){
            for(int l=1;l<=i;l++){
                printf("* ");
            }
            printf("\n");
        }
    }
}