#include<stdio.h>
#include<iostream>
#include<math.h>
using namespace std;
main(){
	int casos;
	cin>>casos;
	for(int i=1;i<casos+1;i++){
		double l;
		cin>>l;
		double pi=3.141592654;
		double diametro=0,radio=0,ph=0,a=0,r2=0,atp=0,ah=0;
		diametro=l/pi;
		radio=diametro/2;
		ph=radio*6;
		r2=radio/2;
		a=sqrt(pow(radio,2)-pow(r2,2));
		atp=a*r2/2;
		ah=ph*a/2;
		cout<<"Case "<<i<<endl;
		printf("Rice: %.2f\n",ah/2-atp);
		printf("Beans: %.2f\n",ah/2+atp);
	}
}