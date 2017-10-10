#include<cstdio>
#include<iostream>
#include<cmath>
using namespace std;
main(){
	long long int a;
	cin>>a;
	int cont;
	while(a!=0){
		long long int result;
		result=ceil(((sqrt(((a*2)*4)+9))+3)/2);
		cont++;
		cout<<"Case "<<cont<<": "<<result<<endl;
		cin>>a;
	}
}