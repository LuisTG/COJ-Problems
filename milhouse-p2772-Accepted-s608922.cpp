#include<cstdio>
#include<iostream>
#include<algorithm>
using namespace std;
main(){
	int cant,agri;
	cin>>cant;
	cin>>agri;
	int a[agri];
	for(int i=0;i<agri;i++){
		cin>>a[i];
	}
	int elements= sizeof(a)/sizeof(a[0]);
	sort(a,a+elements);
	int aux,menor=0,precio=0;
	if(agri<=cant){
		for(int i=0;i<agri;i++){
			aux=a[i]*(agri-i);
			if(menor<aux){
				menor=aux;
				precio=a[i];
			}
		}
	}else{
		int inicio=agri-cant;
			for(int i=inicio;i<agri;i++){
			aux=a[i]*(agri-i);
			if(menor<aux){
				menor=aux;
				precio=a[i];
			}
		}
	}
	cout<<precio<<" "<<menor<<endl;
}