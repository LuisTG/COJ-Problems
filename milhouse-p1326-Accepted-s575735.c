#include<stdio.h>
main(){
	int casos,inicial,transacciones,cantidad;
	char op;
	scanf("%d",&casos);
	while(casos--){
	scanf("%d",&inicial);
	scanf("%d",&transacciones);
	while(transacciones--){
		scanf(" %c",&op);
		scanf("%d",&cantidad);
		if(op=='C'){
			inicial=inicial+cantidad;
		}
		else{
			inicial=inicial-cantidad;
		}
	}
	printf("%d\n",inicial);
	}
}