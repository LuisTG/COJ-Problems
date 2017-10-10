#include<stdio.h>
#include<math.h>
#include<iostream>
using namespace std;
main(){
	int n;
	cin>>n;
	for(int i=1;i<n+1;i++){
		int elem=12;
		double aux,sum=0;
		while(elem--){
			cin>>aux;
			sum+=aux;
		}
		sum=sum/12;
		int cont=0;
	if(sum>999){
		int x=(int)sum;
		if(x%1000==0){
			while(sum!=0){
				sum-=1000;
				cont++;
			}
			printf("%d $%d,000.00\n",i,cont);
		}
		else{
		while(sum>999){
			sum=sum-1000;
			cont++;
		}
			printf("%d $%d,%.2f\n",i,cont,sum);
		}
	}
	else{
		printf("%d $%.2f\n",i,sum);
	}
	}
}