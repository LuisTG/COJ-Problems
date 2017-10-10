#include<cstdio>
#include<iostream>
#include<cstring>
using namespace std;
main(){
	int a;
	cin>>a;
	string m[a];
	string n[a];
	for(int i=0;i<a;i++){
		cin>>m[i];
		cin>>n[i];
	}
	int b;
	cin>>b;
	string x[b];
	string y[b];
	for(int i=0;i<b;i++){
		cin>>x[i];
		cin>>y[i];
	}
	int cont;
	for (int i = 0; i < b; i++) {
            cont=0;
            for (int j = 0; j < a; j++) {
                if(n[j]==y[i]){
                    cont++;
                }
            }
            cout<<cont<<endl;
        }
}