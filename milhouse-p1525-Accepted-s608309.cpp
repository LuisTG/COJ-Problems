#include<stdio.h>
#include<iostream>
#include<math.h>
using namespace std;
main(){
	int a,b,i,cont=0,result=0;
	scanf("%d",&a);
	scanf("%d",&b);
	while(a>0 && b>0){
		if(a%2==0 || b%2==0){
			break;
		}
		a/=2;
		b/=2;
		cont++;
	}
	if(cont>0){
	for(int i=0;i<cont;i++){
		result+=pow(4,i);
	}
	}
	cout<<result<<endl;
}