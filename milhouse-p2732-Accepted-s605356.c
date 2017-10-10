#include<stdio.h>
#include<string.h>
main(){
	char palabra[100];
	int n,aux,largo;
	scanf("%d",&n);
	while(n--){
		scanf("%s",palabra);
		largo=strlen(palabra);
		for(int i=0;i<largo;i++){
			aux=palabra[i];
			if(aux<91){
				aux+=32;
				printf("%c",aux);
			}
			else{
				aux-=32;
				printf("%c",aux);
			}
		}
		printf("\n");
	}
}