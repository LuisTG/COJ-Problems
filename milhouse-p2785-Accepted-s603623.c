#include<stdio.h>
main(){
	int n,cont,sum=0,entrada;
	scanf("%d",&n);
	cont=n;
	while(n--){
		scanf("%d",&entrada);
		sum+=entrada;
	}
	printf("%.2f\n",sum*1.0/cont);
}