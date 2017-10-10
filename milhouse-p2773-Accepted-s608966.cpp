#include<cstdio>
#include<iostream>
using namespace std;
main(){
	int a,b,c;
	int ord[100]={0};
	cin>>a;
	cin>>b;
	cin>>c;
	for(int i=1;i<a+1;i++){
			for(int m=1;m<b+1;m++){
					for(int n=1;n<c+1;n++){
						ord[i+m+n]++;
					}
			}
	}
	int menor=0,mayor=0;
	for(int i=1;i<100;i++){
		if(mayor<ord[i]){
			mayor=ord[i];
			menor=i;
		}
	}
	cout<<menor<<endl;
}