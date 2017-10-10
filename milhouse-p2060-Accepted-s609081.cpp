#include<cstdio>
#include<iostream>
using namespace std;
main(){
	int a;
	cin>>a;
	while(a!=-1){
		int aux,cont=0,acum=0;
		while(a--){
			cin>>aux;
			acum+=aux;
			if(acum%100==0){
				aux=acum/100;
				acum=acum-aux*100;
				cont++;
			}
		}
		cout<<cont<<endl;
		cin>>a;
	}
}