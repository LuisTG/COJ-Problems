#include<stdio.h>
#include<iostream>
using namespace std;
main(){
	long long int a,b;
	cin>>a;
	cin>>b;
	while(a!=0||b!=0){
		long long int c=0;
		c=a-(b-a);
		cout<<c<<endl;
			cin>>a;
		cin>>b;
	}
}
