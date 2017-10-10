#include<stdio.h>
#include<string.h>
#include<iostream>
using namespace std;
main(){
	int a;
	double c;
	cin>>c;
	cin>>a;
	switch(a){
		case 1:
			printf("%.1f\n",c);
			break;
		case 2:
			printf("%.2f\n",c);
			break;
		case 3:
			printf("%.3f\n",c);
			break;
		case 4:
			printf("%.4f\n",c);
			break;
		case 5:
			printf("%.5f\n",c);
			break;
		case 6:
			printf("%.6f\n",c);
			break;
				
	}
}