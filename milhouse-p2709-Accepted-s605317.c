#include<stdio.h>
main(){
	int num[501]={0};
	int n,cont,aux,x=0;
	scanf("%d",&n);
	scanf("%d",&cont);
	while(cont--){
		scanf("%d",&aux);
		num[aux]=1;
	}
	n++;
	for(int i=1;i<n;i++){
		if(num[i]==0){
			x++;
		}
	}
	printf("%d\n",x);
}