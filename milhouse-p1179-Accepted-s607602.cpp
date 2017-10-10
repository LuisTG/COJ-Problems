#include<stdio.h>
#include<iostream>
using namespace std;
main(){
	int casos;
	cin>>casos;
	while(casos--){
		int num,mayor=0,menor=0,pos;
		cin>>num;
		cin>>pos;
		num--;
		menor=pos;
		mayor=pos;
		while(num--){
			cin>>pos;
			if(pos>mayor){
				mayor=pos;
			}
			if(pos<menor){
				menor=pos;
			}
		}
		cout<<(mayor-menor)*2<<endl;
	}
}