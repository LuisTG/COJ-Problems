#include<stdio.h>
#include<string.h>
main(){
	char a[31];
	char b[31];
	int largo1,largo2,aux1,aux2;
	int z=0;
	scanf("%s",a);
	scanf("%s",b);
	largo1=strlen(a);
	largo2=strlen(b);
	for(int i=0;i<largo1;i++){
		for(int x=0;x<largo2;x++){
			if(a[i]==b[x]){
				aux1=i;
				aux2=x;
				z=1;
				break;
			}
		}
		if(z==1){
			break;
		}
	}
	int ena=0,enb=0;
		for(int i=0;i<largo2;i++){
			for(int x=0;x<largo1;x++){
				if(x==aux1&&i==aux2){
					printf("%c",b[enb]);
					ena++;
					enb++;	
				}
			else{
				if(x==aux1){
					printf("%c",b[enb]);
					enb++;
				}
				else{
					if(i==aux2){
						printf("%c",a[ena]);
						ena++;
					}
					else{
						printf(".");
					}
				}
			}
			}
			printf("\n");
		}
}