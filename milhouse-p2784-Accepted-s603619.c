#include<stdio.h>
main(){
	int n;
	int num[10000];
	int aux;
	scanf("%d",&n);
for(int i=0; i<n;i++){
	scanf("%d",&num[i]);
}
for(int i=0;i<n-1;i++){
	for(int j=i+1;j<n;j++){
	if(num[i]>num[j]){
		aux=num[i];
		num[i]=num[j];
		num[j]=aux;
	}
}
}
if(n==1){
	printf("%d\n",num[0]);
}
else{
printf("%d ",num[n-1]);
for(int i=0;i<n-2;i++){
	printf("%d ",num[i]);
}
printf("%d\n",num[n-2]);
}
}