#include<cstdio>
#include<cstring>
#include<iostream>
#include<sstream>
using namespace std;
main(){
	int x;
	cin>>x;
	int cont=1;
	while(x!=0){
		int apar[10]={0};
		int y,mayor=0,menor=0;
		string n="";
		cin>>y;
		if(x>y){
			mayor=x;
			menor=y;
		}else{
			mayor=y;
			menor=x;
		}
		for(int i=menor;i<=mayor;i++){
			stringstream os;
			os<<i;
			n=n+os.str();
		}
		for(int i=0;i<n.length();i++){
			switch(n[i]){
				case '0':
					apar[0]++;
					break;
				case '1':
					apar[1]++;
					break;
				case '2':
					apar[2]++;
					break;
				case '3':
					apar[3]++;
					break;
				case '4':
					apar[4]++;
					break;
				case '5':
					apar[5]++;
					break;
				case '6':
					apar[6]++;
					break;
				case '7':
					apar[7]++;
					break;
				case '8':
					apar[8]++;
					break;
				case '9':
					apar[9]++;
					break;
			}
		}
		cout<<"Case "<<cont<<":"<<" 0:"<<apar[0]<<" 1:"<<apar[1]<<" 2:"<<apar[2]<<" 3:"<<apar[3]<<" 4:"<<apar[4]<<" 5:"<<apar[5]<<" 6:"<<apar[6]<<" 7:"<<apar[7]<<" 8:"<<apar[8]<<" 9:"<<apar[9]<<endl;
		cont++;
		cin>>x;
	}
}