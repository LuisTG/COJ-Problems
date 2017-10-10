#include<cstdio>
#include<iostream>
using namespace std;
main(){
	int a,b,c;
	while(scanf("%d",&a)==1){
		cin>>b;
		cin>>c;
		switch(a){
			case 0:
				switch(b){
					case 1:
						switch(c){
							case 1:
								cout<<"A"<<endl;
								break;
							case 0:
								cout<<"B"<<endl;
								break;
						}
						break;
					case 0:
						switch(c){
							case 1:
								cout<<"C"<<endl;
								break;
							case 0:
								cout<<"*"<<endl;
								break;
						}
						break;
				}
				break;
			case 1:
				switch(b){
					case 1:
						switch(c){
							case 1:
								cout<<"*"<<endl;
								break;
							case 0:
								cout<<"C"<<endl;
								break;
						}
						break;
					case 0:
						switch(c){
							case 1:
								cout<<"B"<<endl;
								break;
							case 0:
								cout<<"A"<<endl;
								break;
						}
						break;
				}
				break;
		}
	}
}