#include<stdio.h>
main(){
	int votos[10];
	int candidatos,total=0,aux;
	double diez,cuar,cuarcin;
	scanf("%d",&candidatos);
	for(int i=0;i<candidatos;i++){
		scanf("%d",&votos[i]);
		total+=votos[i];
	}
	for(int i=0;i<candidatos-1;i++){
		for(int j=i+1;j<candidatos;j++){
			if(votos[i]<votos[j]){
				aux=votos[i];
				votos[i]=votos[j];
				votos[j]=aux;
			}
		}
	}
	diez=total*.10;
	cuar=total*.40;
	cuarcin=total*.45;
	if(votos[0]>=cuarcin){
		printf("1\n");
	}
	else{
		if(votos[0]>=cuar){
			if(votos[0]>=(votos[1]+diez)){
				printf("1\n");
			}
			else{
				printf("2\n");
			}
		}
		else{
			printf("2\n");
		}
	}
}