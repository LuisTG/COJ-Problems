#include<stdio.h>
#include<iostream>
using namespace std;
main(){
	int casos;
	int result[]={0,1,12,213,2314,24513,312456,3412567,36712458};
	cin>>casos;
	while(casos--){
		int n;
		cin>>n;
		cout<<result[n]<<endl;
	}
}