#include<stdio.h>
#include<iostream>
using namespace std;
main(){
	int n,m,x,y,pasos;
	cin>>x;
	cin>>y;
	cin>>n;
	cin>>m;
	cin>>pasos;
	int num[pasos];
	char ori[pasos];
for(int i=pasos-1;i>-1;i--){
		cin>>ori[i];
		cin>>num[i];
	}
	for(int i=0;i<pasos;i++){
		switch(ori[i]){
			case 'N':
				n=n+num[i];
			break;
			case 'S':
				n=n-num[i];
				break;
			case 'E':
				m=m-num[i];
				break;
			case 'W':
				m=m+num[i];
				break;
		}
	}
	cout<<n<<" "<<m<<endl;
}