#include<stdio.h>
main(){
       int casos,x,y;
       scanf("%d",&casos);
       while(casos--){
         scanf("%d",&x);
         scanf("%d",&y);
         if(x>=y){
         	if(y+3<=x){
         		printf("No Number\n");
         	}
         	else
         if(x%2==0 && y%2==0){
                   printf("%d\n",(x+y));
                   }
         else
             if(x%2!=0&&y%2!=0){
                  printf("%d\n",(x+y)-1);
                  }
                  else{
                       printf("No Number\n");
                       }
                       }
                       else{
                       	printf("No Number\n");
                       }
       }
       }