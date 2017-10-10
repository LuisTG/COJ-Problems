#include<cstdio>
#include<iostream>
using namespace std;
main(){
	int n;
	cin>>n;
	int aux;
	int a[n+1];
	int x[n+1];
	for(int i=1;i<=n;i++){
		a[i]=i;
		cin>>x[i];
	}
	for(int i=1;i<n;i++){
		for(int j=i+1;j<=n;j++){
			if(x[i]<x[j]){
				aux=x[i];
				x[i]=x[j];
				x[j]=aux;
				aux=a[i];
				a[i]=a[j];
				a[j]=aux;
			}
		}
	}
	for(int i=1;i<=n;i++){
		cout<<a[i]<<endl;
	}
}