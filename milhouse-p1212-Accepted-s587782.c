#include<stdio.h>
#include<string.h>
main(){
	double suma = 0;
    int cont = 0;
    char comp[210];
    scanf("%s",comp);
    while(comp[0]!='*'){
    	int largo=strlen(comp);
    	for(int i=1;i<largo;i++){
                        if (comp[i] == 'H') {
                            suma = suma + .5;
                        }  else if (comp[i] == 'W') {
                            suma = suma + 1;
                        }  else if (comp[i] == 'Q') {
                            suma = suma + .25;
                        }  else if (comp[i] == 'E') {
                            suma = suma + 0.125;
                        }  else if (comp[i] == 'S') {
                            suma = suma + .0625;
                        }  else if (comp[i] == 'T') {
                            suma = suma + .03125;
                        } else if (comp[i] == 'X') {
                            suma = suma + .015625;
                    }else if (comp[i] == '/') {
                           if(suma==1) cont++;
                           suma=0;
                           
                }
                }
                printf("%d\n",cont);
		scanf("%s",comp);
		cont=0;
    }
}