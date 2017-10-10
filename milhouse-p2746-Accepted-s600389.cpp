#include<stdio.h>
#include<string.h>
main(){
	char palabra[1000];
	char vocal[5]={'A','E','I','O','U'};
	scanf("%s",palabra);
	int v=0,c=0;
	for(int i=0;i<strlen(palabra);i++){
		if(palabra[i]==vocal[0]||palabra[i]==vocal[1]||palabra[i]==vocal[2]||palabra[i]==vocal[3]||palabra[i]==vocal[4]){
			v++;
		}
		else{
			c++;
		}
	}
	printf("%d %d\n",v,c);
}