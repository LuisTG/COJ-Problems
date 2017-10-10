#include<stdio.h>
#include<string.h>
main(){
int numeros[]={1,2,6,24,120};
char a[5];
int n=0;
scanf("%s",&a);
while(a[0]!='0'){
	for(int i=strlen(a)-1,cont=0; i>-1;i--,cont++){
	n+=(a[cont]-48)*numeros[i];	
	}
	printf("%d\n",n);
	scanf("%s",&a);
	n=0;
}
}
