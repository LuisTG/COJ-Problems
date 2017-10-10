#include<stdio.h>
#include<iostream>
using namespace std;
main(){
	int casos;
	cin>>casos;
	while(casos--){
		double a,b;
		double a1=0,a2=0;
		cin>>a;
		cin>>b;
		a1=(a/4*b/2)/2;
		a2=(a/2*b/4);
		a1=a1+a2;
		printf("%.8f\n",a1);
	}
}