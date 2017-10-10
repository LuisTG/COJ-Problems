#include<stdio.h>
#include<string.h>

main(){
	char num1[8];
	while(scanf("%s",num1)==1){
		int cont=0;
		char num2[8];
		for(int i=0,p=strlen(num1)-1;i<strlen(num1);i++,p--){
			num2[i]=num1[p];
		}
		for(int i=0;i<strlen(num1);i++){
			if(num1[i]<num2[i]){
				printf("YES\n");
				break;
			}
			else if(num1[i]>num2[i]){
				printf("NO\n");
				break;
			}
			else{
				cont++;
			}
		}
		if(cont==strlen(num1)){
			printf("NO\n");
		}
	}
}
