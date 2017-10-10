#include<cstdio>
#include<iostream>
#include<cstring>
#include<sstream>
int sumatoria(int b);
using namespace std;
string n;
main(){
	string z;
	cin>>n;
	int x=1,suma=0,cont=0;
	stringstream os;
	while(n!="0"){
		z=n;
		while(x>0){
			//funcion recursiva
			suma=sumatoria(n.length()-1);
			if(suma%9!=0){
				break;
			}else{
				cont++;
				os<<suma;
				n=os.str();
			}
			if(suma==9){
				x=0;
			}
			suma=0;
			os.str("");
		}
		if(cont!=0){
			cout<<z<<" is a multiple of 9 and has 9-degree "<<cont<<"."<<endl;
		}
		else{
			cout<<z<<" is not a multiple of 9."<<endl;
		}
		cin>>n;
		suma=cont=0;
		x=1;
	}
}
int sumatoria(int v){
	if (v==0) return n[v]-48;
	return n[v]-48+sumatoria(v-1);
}