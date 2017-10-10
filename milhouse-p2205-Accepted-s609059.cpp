#include<cstdio>
#include<iostream>
using namespace std;
main(){
	int a,b,c;
	cin>>a;
	while(a--){
		cin>>b;
		cin>>c;
		int aux,cont=0;
		for(int i=b;i<c+1;i++){
			aux=i;
			while(aux>0){
				if((aux&1)==1){
					cont++;
				}
				aux>>=1;
			}
		}
		cout<<cont<<endl;
	}
}