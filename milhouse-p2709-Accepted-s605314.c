#include<stdio.h>
#include<string.h>
main(){
	int num[501]={0};
	int n,cont,aux;
	scanf("%d",&n);
	scanf("%d",&cont);
	while(cont--){
		scanf("%d",&aux);
		num[aux]=1;
	}
	cont++;
	n++;
	for(int i=1;i<n;i++){
		if(num[i]==0){
			cont++;
		}
	}
	printf("%d\n",cont);
}