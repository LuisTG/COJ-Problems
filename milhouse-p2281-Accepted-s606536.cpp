#include<stdio.h>
#include<string.h>
#include<math.h>
#include<iostream>
using namespace std;
main(){
	int casos;
	cin>>casos;
	while(casos--){
		int largo;
		string x="";
		cin>>x;
		largo=sqrt(x.length());
		int posicion=largo-1;
		for(int i=largo-1;i>-1;){
			while(posicion<x.length()){
				cout<<x[posicion];
				posicion+=largo;
			}
			i--;
			posicion=i;
		}
		cout<<endl;
	}
}