#include<cstdio>
#include<iostream>
#include<algorithm>
using namespace std;
main(){
	int v,cont=0;
	cin>>v;
	int cant;
	cin>>cant;
	int num[cant];
	for(int i=0;i<cant;i++){
		cin>>num[i];
	}
	cant=sizeof(num)/sizeof(num[0]);
	sort(num,num+cant);
	for(int i=0;i<cant;i++){
		if(num[i]>v){
			cant=i+1;
			break;
		}
	}
	int aux;
	for(int i=0;i<cant;i++){
		aux=0;
		for(int x=0;x<cant;x++){
			if(x!=i)
			for(int y=0;y<cant;y++){
				if(y!=x)
				if((num[i]+num[x]+num[y])<=v){
					cont++;
					aux=1;
					break;
				}
			}
			if(aux==1){
				break;
			}
		}
	}
	cout<<cont<<endl;
}