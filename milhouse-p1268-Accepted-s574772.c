#include<stdio.h>
#include<math.h>
main() {
        int n,cont=0;
        double result,raiz;
        scanf("%d",&n);
        raiz=sqrt(n);
        if (n % 2 != 0 ) {
        for (double i = 3; i <= raiz; i+=2) {
            result=(n/i);
            if (result==(int)result) {
                cont++;
                break;
            }
            }
        } else {
        	if (n>1&&n<5) {
                cont = 0;
            } else {
                cont++;
       }
   }
        if (cont>0||n==1) {
            printf("YES\n");
        }
        else{
            printf("NO\n");
        }
        
    }