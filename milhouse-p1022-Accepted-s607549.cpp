#include<stdio.h>
#include<iostream>
using namespace std;
main(){
	int n;
	cin>>n;
	while(n--){
		int x;
		int cont=0,b;
		cin>>x;
		int array[x];
		for(int i=0;i<x;i++){
			cin>>array[i];
		}
		for(int i=0;i<x-1;i++){
			for(int z=i+1;z<x;z++){
				if(array[i]>array[z]){
					cont++;
					b=array[i];
					array[i]=array[z];
					array[z]=b;
				}
			}
		}
		printf("Optimal train swapping takes %d swaps.\n",cont);
	}
}