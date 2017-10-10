#include<cstdio>
#include<iostream>
#include<cmath>
using namespace std;
main(){
	double a[6][3]={0};
	for(int i=0;i<6;i++){
		for(int x=0;x<3;x++){
			cin>>a[i][x];
		}
	}
	double r1,r2,r3,r4;
	double puna[4]={0},punb[4]={0};
	//num 1 :(
		if(a[0][2]==0){
			puna[0]=1;
			punb[0]=(a[0][0]*-1)/a[0][1];
		}else{
			puna[0]=0;
			punb[0]=(a[0][2]*-1)/a[0][1];
		}
	//num2 :/
			if(a[1][2]==0){
			puna[1]=1;
			punb[1]=(a[1][0]*-1)/a[1][1];
		}else{
			puna[1]=0;
			punb[1]=(a[1][2]*-1)/a[1][1];
		}
	//num3 :)
			if(a[3][2]==0){
			puna[2]=1;
			punb[2]=(a[3][0]*-1)/a[3][1];
		}else{
			puna[2]=0;
			punb[2]=(a[3][2]*-1)/a[3][1];
		}
	//num 4 :D
		if(a[4][2]==0){
			puna[3]=1;
			punb[3]=(a[4][0]*-1)/a[4][1];
		}else{
			puna[3]=0;
			punb[3]=(a[4][2]*-1)/a[4][1];
		}
		
		//Ya me salieron C:
		//num 1 :(
		r1=abs((a[1][0]*puna[0])+(a[1][1]*punb[0])+a[1][2]);
		r1=r1/sqrt(pow(a[1][0],2)+pow(a[1][1],2));

		
		//num 2 :/
		
		r2=abs((a[2][0]*puna[1])+(a[2][1]*punb[1])+a[2][2]);
		r2=r2/sqrt(pow(a[2][0],2)+pow(a[2][1],2));

		
				
		//num 3 :)
		
		r3=abs((a[4][0]*puna[2])+(a[4][1]*punb[2])+a[4][2]);
		r3=r3/sqrt(pow(a[4][0],2)+pow(a[4][1],2));

		
				//num 4 :D
		
		r4=abs((a[5][0]*puna[3])+(a[5][1]*punb[3])+a[5][2]);
		r4=r4/sqrt(pow(a[5][0],2)+pow(a[5][1],2));

		
		double resultado,aux;
		aux=sqrt(pow(r1,2)+pow(r4,2))+sqrt(pow(r2,2)+pow(r4,2));
		resultado=r1+r2+(r3*2)+aux;
		printf("%.2f\n",resultado);
}