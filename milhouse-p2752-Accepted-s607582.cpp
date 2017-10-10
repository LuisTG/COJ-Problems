#include<stdio.h>
#include<string.h>
#include<iostream>
using namespace std;
main(){
	string nombre[100];
	int x[100];
	int positivo[1001];
	int negativo[1001];
	int n;
	cin>>n;
	for(int i=0;i<n;i++){
		cin>>nombre[i];
		cin>>x[i];
		if(x[i]>0){
			positivo[x[i]]=1;
		}
		else{
			x[i]=x[i]*-1;
			negativo[x[i]]=-1;
		}
	}
	cout<<"FOREVER ALONE ones:"<<endl;
	for(int i=0;i<n;i++){
		if(positivo[x[i]]+negativo[x[i]]!=0){
			cout<<nombre[i]<<endl;
		}
	}
}