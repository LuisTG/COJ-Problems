#include<cstdio>
#include<cstring>
#include<iostream>
using namespace std;
main(){
	string x;
	cin>>x;
	string a,b,aux;
	if(x.length()%2==0){
	a=x.substr(0,x.length()/2);
	b=x.substr(x.length()/2,x.length());
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
	a=x.substr(0,x.length()/2);
	b=x.substr(x.length()/2+1,x.length());
	aux=x[x.length()/2];
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