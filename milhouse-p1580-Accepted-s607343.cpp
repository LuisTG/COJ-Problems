#include<stdio.h>
#include<iostream>
using namespace std;
main(){
	int a;
	cin>>a;
	while(a!=0){
		int mayor=a;
	while(a!=1){
		if(a%2==0){
			a/=2;
		}else{
			a=a*3+1;
		}
		if(mayor<a){
			mayor=a;
		}
	}
	cout<<mayor<<endl;
	cin>>a;
}
}