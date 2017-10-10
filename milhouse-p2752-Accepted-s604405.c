#include<stdio.h>
main(){
	char nombre[100][11];
	int x[100];
	int positivo[1001]={0};
	int negativo[1001]={0};
	int n;
	scanf("%d",&n);
	for(int i=0;i<n;i++){
		scanf("%s",&nombre[i]);
		scanf("%d",&x[i]);
		if(x[i]>0){
			positivo[x[i]]=1;
		}
		else{
			x[i]=x[i]*-1;
			negativo[x[i]]=1;
		}
	}
	printf("FOREVER ALONE ones:\n");
	for(int i=0;i<n;i++){
		if(positivo[x[i]]==1 && negativo[x[i]]==0||positivo[x[i]]==0 && negativo[x[i]]==1){
			printf("%s\n",nombre[i]);
		}
	}
}