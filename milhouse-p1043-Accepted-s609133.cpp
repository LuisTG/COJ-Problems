#include<cstdio>
#include<iostream>
#include<cstring>
#include<sstream>
using namespace std;
main(){
	int x[15]={1 , 2 , 4 , 8 , 16 , 32 , 64 , 128 , 256 , 512 , 1024 , 2048 , 4096 , 8192 , 16384,};
	int a;
	cin>>a;
	while(a--){
		int b;
		cin>>b;
		string z="";
		for(int i=14;i>-1;i--){
			stringstream os;
			if(b>=x[i]){
				b=b-x[i];
				os<<i;
				z=os.str()+" "+z;
			}
			if(b==0){
				break;
			}
		}
		cout<<z.substr(0,z.length()-1)<<endl;
	}
}