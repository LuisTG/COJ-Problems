#include<stdio.h>

main(){
       int numeros[]={1,64,729,4096,15625,46656,117649,262144,531441,1000000,1771561,2985984,4826809,7529536,11390625,16777216,24137569,34012224,47045881,64000000,85766121};
       int cont=0;
       int y,x;
       while(scanf("%d",&y)==1){
       scanf("%d",&x);
        for (int i = 0; i < 21; i++) {
            if(numeros[i]>=y && numeros[i]<=x){
                cont++;
        }
            
   }
        printf("%d\n",cont);
        cont=0;
    }
    
    }
