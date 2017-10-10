#include<stdio.h>
#include<iostream>
using namespace std;
main(){
	int x;
	cin>>x;
	while(x!=0){
		int n=x-1;
		cout<<x<<" => "<<n*x+1<<endl;
		cin>>x;
	}
}