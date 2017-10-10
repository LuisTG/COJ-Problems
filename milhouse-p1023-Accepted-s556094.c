#include<stdio.h>
main(){
       float num,cont=0;
       for(int i=1;i<=12;i++){
       scanf("%f",&num);
       cont=cont+num;
       }
       cont=cont/12.0;
       printf("$%.2f",cont);
       }