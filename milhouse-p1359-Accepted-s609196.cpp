#include<cstdio>
#include<iostream>
#include<cstring>
using namespace std;
main(){
	int a,b,cont=0;
	cin>>a;
	cin>>b;
	while(a!=0||b!=0){
		string x;
		int aux,problemas[b],B=0,C=0,result=0,suma;
		for(int i=0;i<a;i++){
			suma=0;
			cin>>x;
			for(int j=0;j<b;j++){
				cin>>aux;
				if(aux==1){
					problemas[j]=1;
				}
				suma+=aux;
			}
			if(suma>1){
				B++;
			}
			if(suma==b){
				C++;
			}
		}
		suma=0;
		for(int i=0;i<b;i++){
			suma+=problemas[i];
problemas[i]=0;
		}
		if(suma==b){
			result+=1;
		}
		double nov=a*.9;
		if(B>nov){
			result+=2;
		}
		if(C==0){
			result+=2;
		}
		printf("Contest %d: %d\n",++cont,result);
	cin>>a;
	cin>>b;
	}
}