#include<stdio.h>
#include<string.h>
main(){
	int casos,numBolsas,totalBolsas,aux,suma;
	int peso[1000];
	char camino[9];
	scanf("%d",&casos);
	while(casos--){
		scanf("%d",&totalBolsas);
		scanf("%d",&numBolsas);
		scanf("%s",camino);
		for(int i=0;i<totalBolsas;i++){
			scanf("%d",&peso[i]);
		}
		for(int i=0;i<totalBolsas-1;i++){
			for(int j=i+1;j<totalBolsas;j++){
				if(peso[i]>peso[j]){
					aux=peso[i];
					peso[i]=peso[j];
					peso[j]=aux;
				}
			}
		}
		if(totalBolsas==numBolsas){
			for(int i=0;i<totalBolsas;i++){
				suma+=peso[i];
			}
		}
		else{
		if(strcmp(camino,"regular")==0){
			aux=totalBolsas-numBolsas;
			for(int i=aux;i<totalBolsas;i++){
				suma+=peso[i];
			}
		}
		else{
			for(int i=0;i<numBolsas;i++){
				suma+=peso[i];
			}
		}
	}
		printf("%d\n",suma);
		suma=0;
	}
}