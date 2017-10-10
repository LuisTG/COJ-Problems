#include<stdio.h>
#include<iostream>
using namespace std;
main(){
	int casos;
	long long int a,b,c;
	long long int max[6];
	cin>>casos;
	while(casos--){
		cin>>a;
		cin>>b;
		cin>>c;
		max[0]=(a*b)+c;
		max[1]=(a*c)+b;
		max[2]=(c*b)+a;
		max[3]=(a+b)*c;
		max[4]=(a+c)*b;
		max[5]=(c+b)*a;
		for(int i=0;i<5;i++){
			for(int x=i+1;x<6;x++){
				if(max[i]>max[x]){
					a=max[i];
					max[i]=max[x];
					max[x]=a;
				}
			}
		}
		cout<<max[0]<<" "<<max[5]<<endl;
	}
}