#include<cstdio>
#include<iostream>
using namespace std;
main(){
	int a;
	cin>>a;
	while(a--){
		int b,aux,cont=0,n;
		cin>>b;
		n=b-1;
		while(b--){
			cin>>aux;
			cont+=aux;
		}
		cont=cont-n;
		cout<<cont<<endl;
	}
}