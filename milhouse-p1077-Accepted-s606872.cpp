#include<stdio.h>
#include<iostream>
using namespace std;
main(){
	int a,b;
	while(scanf("%d %d",&a,&b)==2){
		int cont=0,menor=0,aux1,aux2;
		if(a>b){
			aux1=b;
			aux2=a;
		}else{
			aux1=a;
			aux2=b;
		}
		for(int i=aux1;i<aux2+1;i++){
			int n=i;
			while(n!=1){
				if(n%2==0){
					n=n/2;
				}else{
					n=n*3+1;
				}
				cont++;
			}
			cont++;
			if(menor<cont){
				menor=cont;
			}
			cont=0;
		}
		cout<<a<<" "<<b<<" "<<menor<<endl;
	}
}