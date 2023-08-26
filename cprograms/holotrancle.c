# include <stdio.h>
int main (void){
    int i,j;
    for(i=1;i<=5;i++){
        for(j=1;j<=9;j++){
            if(i==1||i==j|j+i ==10){
                //i==5||i+j==6||j-i==4;
                printf("*");
                
            }else{
                printf(" ");
            }
        }
        printf("\n");
    }
}