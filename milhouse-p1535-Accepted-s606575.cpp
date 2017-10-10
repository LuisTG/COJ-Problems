#include<stdio.h>
#include<iostream>
#include<algorithm>
using namespace std;
main(){
	int casos;
	cin>>casos;
	cout<<"Lumberjacks:"<<endl;
	while(casos--){
		int a[10],b[10];
		for(int i=0;i<10;i++){
			cin>>a[i];
			b[i]=a[i];
		}
		int elements= sizeof(a)/sizeof(a[0]);
		sort(a,a+elements);
		int cont=0,aux=0;
		for(int i=0;i<10;i++){
			if(a[i]==b[i]){
				cont++;
			}
			else{
				aux=1;
				break;
			}
		}
		if(aux==1){
			cont=0;
			for(int x=0,i=9;i>-1;i--,x++){
			if(a[i]==b[x]){
				cont++;
			}
			else{
				aux=1;
				break;
			}
		}
		}
		if(cont==10){
			cout<<"Ordered"<<endl;
		}
		else{
			cout<<"Unordered"<<endl;
		}
	}
}