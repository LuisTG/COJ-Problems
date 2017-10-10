#include<cstdio>
#include<iostream>
using namespace std;
main(){
	int a;
	cin>>a;
	while(a--){
		int x,y;
		cin>>x;
		cin>>y;
		if((x+y)%2==0){
			cout<<"Second"<<endl;
		}else{
			cout<<"First"<<endl;
		}
	}
}