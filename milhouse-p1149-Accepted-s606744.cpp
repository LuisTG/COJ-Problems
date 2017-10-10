#include<stdio.h>
#include<string.h>
#include<iostream>
using namespace std;
main(){
	int a,b,c;
	int casos=0;
	cin>>a;
	cin>>b;
	cin>>c;
	while(a!=0&&b!=0&&c!=0){
		int largo;
		string x="",z="";
		largo=((a+b)*c)+b;
		for(int i=0,m=0,n=0;i<largo;i++){
			x=x+'*';
			if(m<b){
				z=z+'*';
				m++;
			}
			else{
				if(n<a){
					z=z+'.';
					n++;
				}
				else {
					z=z+'*';
					m=1;
					n=0;
				}
			}
		}
		casos++;
		printf("Case %d:\n",casos);
		int cont=0;
		while(cont<c){
			for(int i=0;i<b;i++){
			cout<<x<<endl;
			}	
			for(int i=0;i<a;i++){
				cout<<z<<endl;
			}
			cont++;
		}
			for(int i=0;i<b;i++){
			cout<<x<<endl;
			}
	cin>>a;
	cin>>b;
	cin>>c;	
		cout<<endl;
	}
}