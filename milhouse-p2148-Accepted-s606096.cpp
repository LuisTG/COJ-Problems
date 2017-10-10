#include<stdio.h>
#include<iostream>
using namespace std;
main(){
	int casos;
	cin>>casos;
	while(casos--){
		int a,b,c;
		cin>>a;
		cin>>b;
		cin>>c;
		a=4*a*c;
		b=b*b;
		if(a>b){
			cout<<"NO"<<endl;
		}
		else{
			cout<<"SI"<<endl;
		}
	}
}