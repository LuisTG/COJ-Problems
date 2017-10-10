#include<stdio.h>
#include<iostream>
#include<string.h>
using namespace std;
main(){
	int casos;
	cin>>casos;
	while(casos--){
		string x="",z="";
		cin>>x;
		char aux=x[0];
		switch(aux){
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				cout<<x<<"cow"<<endl;
			break;
			default:
				x=x.substr(1,x.length()-1);
				x=x+aux;
				cout<<x<<"ow"<<endl;
				break;
		}
		
	}
}