#include<stdio.h>
#include <string.h>
main(){
        char n[100000],m[100000];
        while(scanf("%s",n)==1){
            scanf("%s",m);
        int largo,largo2;
        int cont=0;
            largo=strlen(n);
            largo2=strlen(m);
        for (int i = 0,x=0; i < largo2 && x<largo; i++) { 
                if (n[x]==m[i]) {
                    cont++;
                    x++;
                }
            }
        if(cont==largo){
            printf("Yes\n");
        }
        else{
            printf("No\n");
        }
    }
    }
