#include<cstdio>
#include<iostream>
using namespace std;
main(){
	int a,b,c;
	cin>>a;
	cin>>b;
	cin>>c;
	while(a!=0 || b!=0||c!=0){
		int aux;
		aux=b-a;
		if(b+aux==c){
			cout<<"AP "<<c+aux<<endl;
		}else{
			aux=b/a;
			cout<<"GP "<<c*aux<<endl;
		}
	cin>>a;
	cin>>b;
	cin>>c;
	}
}