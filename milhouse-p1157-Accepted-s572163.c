#include <stdio.h>
int factorial(int i){
	int x,fact=1;
	if(i==0) return 1;
	else{
		for(x=1;x<=i;x++){
			fact*=x;
		}
		return fact;
	}
}
int main(){
	int i;
	double fact=0.0;
	printf("n e");
	printf("\n- -----------");
	for(i=0;i<10;i++){
		fact += (double) 1 / factorial(i);
		if(i==0||i==1) printf("\n%d %.0f",i,fact);
		else if(i==2) printf("\n%d %.1f",i,fact);
		else printf("\n%d %.9f",i,fact);
	}
}