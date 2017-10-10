#include<cstdio>
#include<iostream>
#include<cstring>
#include<sstream>
using namespace std;
main(){
	int a,b;
	while(scanf("%d",&a)==1){
		cin>>b;
		int cont=0;
		string x="";
		for(int i=a;i<b+1;i++){
			stringstream os;
			int s=0;
			os<<i;
			x=os.str();
			for(int j=0;j<x.length()-1;j++){
				for(int k=j+1;k<x.length();k++){
					if(x[j]==x[k]){
						s=1;
						break;
					}
				}
			}
			if(s==0){
				cont++;
			}
		}
		cout<<cont<<endl;
	}
}