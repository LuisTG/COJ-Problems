#include<stdio.h>
#include<string.h>
main(){
	char opcion[6];
	int cantidad,resultado;
	while(scanf("%s",opcion)==1){
		scanf("%d",&cantidad);
		if(strcmp(opcion,"resta")==0){
			resultado=resultado-cantidad;
		}
		else{
			resultado=resultado+cantidad;
		}
	}
	printf("resultado: %d\n",resultado);
}