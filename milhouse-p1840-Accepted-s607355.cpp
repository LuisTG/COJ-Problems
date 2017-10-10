#include<stdio.h>
#include<string.h>
#include<iostream>
using namespace std;
main(){
	int casos;
	cin>>casos;
	while(casos--){
		int a[6]={0};
		string x;
		cin>>x;
		for(int i=0;i<x.length();i++){
			switch(x[i]){
				case 'B':
					a[0]++;
					break;
				case 'R':
					a[1]++;
					break;
				case 'O':
					a[2]++;
					break;
				case 'K':
					a[3]++;
					break;
				case 'E':
					a[4]++;
					break;
				case 'N':
					a[5]++;
					break;
			}
		}
		int cont=0;
		int z=a[0];
		for(int i=1;i<6;i++){
			if(a[i]==z){
				cont++;
			}
		}
		if(cont==5){
			cout<<"No Secure"<<endl;
		}
		else{
			cout<<"Secure"<<endl;
		}
	}
}