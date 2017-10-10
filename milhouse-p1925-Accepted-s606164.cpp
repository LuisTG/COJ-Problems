#include<stdio.h>
#include <iostream>
#include <algorithm>
using namespace std;
main(){
	long long int nums=0,aux,digito;
	int num,temp,cont=0;
	scanf("%d",&num);
	temp=num;
	long long int array[num];
	while(num--){
		scanf("%lld",&aux);
		while(aux>0){
			digito=aux%10;
			aux/=10;
			nums=nums*10+digito;
		}
		array[cont]=nums;
		cont++;
		nums=0;
	}
	  int elements = sizeof(array) / sizeof(array[0]); 
  std::sort(array, array + elements);
  for (int i = 0; i < elements; ++i) 
     cout << array[i] <<endl;
}