#include<stdio.h>
#include<string.h>
main(){
	int rondas,cant1,cant2,aux,aux2;
	char a[9];
	char b[9];
	scanf("%d",&rondas);
	while(rondas--){
		scanf("%s",a);
		scanf("%s",b);
		if(strcmp(a,"rock")==0){
			aux=1;
		}
		else{
			if(strcmp(a,"paper")==0){
				aux=3;
			}
			else{
				aux=2;
			}
		}
		if(strcmp(b,"rock")==0){
			aux2=1;
		}
		else{
			if(strcmp(b,"paper")==0){
				aux2=3;
			}
			else{
				aux2=2;
			}
		}
		
		switch(aux){
			case 1:
					switch(aux2){
						case 1:
							cant1++;
							cant2++;
						break;
						case 2:
							cant1++;
						break;
						case 3:
							cant2++;
						break;
					}
			break;
			case 2:
				switch(aux2){
						case 1:
							cant2++;
						break;
						case 2:
							cant1++;
							cant2++;
						break;
						case 3:
							cant1++;
						break;
					}
			break;
			case 3:
				switch(aux2){
						case 1:
							cant1++;
						break;
						case 2:
							cant2++;
						break;
						case 3:
							cant1++;
							cant2++;
						break;
					}
			break;
		}
	}
	if(cant1>cant2){
		printf("A win\n");
	}
	else {
		if(cant1<cant2){
			printf("B win\n");
		}
		else{
			printf("tied\n");
		}
	}
}