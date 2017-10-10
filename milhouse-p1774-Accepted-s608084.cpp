#include<stdio.h>
#include<string.h>
#include<iostream>
using namespace std;
main(){
	string x;
	cin>>x;
	int largo=x.length();
	int mayus=0,minus=0,Primayus=0;
	int i=0;
	if(!(x[i]>96 && x[i]<123)){
		Primayus++;
	}
	for( i=0;i<largo;i++){
		if(x[i]>96 && x[i]<123 ){
			minus++;
		}
		else{
			mayus++;
		}
	}
	if(Primayus==1&&mayus==1){
		if(minus==largo-1){
			cout<<x<<endl;
		}
		else{
				for(i=0;i<largo;i++){
					printf("%c",(x[i]+32));
				}
				cout<<endl;
		}
	}else{
		if(minus==largo){
			cout<<x<<endl;
		}
		else{
			for(i=0;i<largo;i++){
				if(x[i]>96 && x[i]<123 ){
					printf("%c",(x[i]-32));
				}
				else{
					printf("%c",(x[i]+32));
				}
			}
			cout<<endl;
		}
	}
}