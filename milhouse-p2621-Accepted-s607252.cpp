#include<stdio.h>
#include<iostream>
using namespace std;
main(){
	int a,cont=0;
	cin>>a;
	while(a>0){
		a/=2;
		cont++;
	}
	cout<<cont<<endl;
}