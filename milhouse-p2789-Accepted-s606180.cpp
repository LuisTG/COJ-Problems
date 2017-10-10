#include<stdio.h>
#include<string.h>
#include<iostream>
#include <algorithm>
using namespace std;
main(){
	string x;
	cin>>x;
	string array[1000];
	int cont=0;
	for(int i=0;i<x.length();i++){
		if(x[i]=='+'){
			cont++;	
		}
		else{
			array[cont]=array[cont]+x[i];
		}
	}
	int elements = sizeof(array) / sizeof(array[0]); 
  std::sort(array, array + elements);
  for (int i = 1000-cont-1; i<999;i++) {

     std::cout << array[i] << '+';
 }
 	 std::cout << array[999] <<endl;
}