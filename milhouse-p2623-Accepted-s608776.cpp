#include<cstdio>
#include<cstring>
#include<iostream>
using namespace std;
main(){
	string x;
	cin>>x;
	string a,b,aux;
	int z=x.length();
	if(z%2==0){
	a=x.substr(0,z/2);
	b=x.substr(z/2,z);
	x="";
	for(int i=a.length()-1;i>-1;i--){
		x=x+a[i];
	}
	for(int i=b.length()-1;i>-1;i--){
		x=x+b[i];
	}
	cout<<x<<endl;
	}
	else{
	a=x.substr(0,z/2);
	b=x.substr(z/2+1,z);
	aux=x[z/2];
	x="";
	for(int i=a.length()-1;i>-1;i--){
		x=x+a[i];
	}
	x=x+aux;
	for(int i=b.length()-1;i>-1;i--){
		x=x+b[i];
	}
	cout<<x<<endl;
	}
}