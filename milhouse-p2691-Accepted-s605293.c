#include<stdio.h>
main(){
	int n,m,aux1=0,aux2=0,lector;
	scanf("%d",&n);
	scanf("%d",&m);
	while(n--){
		scanf("%d",&lector);
		aux1+=lector;
	}
		while(m--){
		scanf("%d",&lector);
		aux2+=lector;
	}
	
	if(aux1>aux2){
		printf("first win\n");
	}
	else{
		if(aux2>aux1){
			printf("second win\n");
		}
		else{
			printf("tie");
		}
	}
}