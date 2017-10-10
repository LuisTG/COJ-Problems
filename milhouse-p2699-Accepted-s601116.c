#include<stdio.h>
main(){
	double suma;
	int lluvia,a=30;
	while(a--){
		scanf("%d",&lluvia);
		suma+=lluvia;
	}
	suma+=suma/30.0;
	printf("%.3f",suma);
}