#include <stdio.h>
main(){
	 char n;
	 int casos;
	 double pi=3.14159,r,h,cons,consmayor=0,volumen,volumenmayor=0;
	 scanf("%d",&casos);
	 while(casos--){
	 	scanf(" %c",&n);
	 if(n=='C'){ //cono
	 	scanf("%lf",&r);
	 	scanf("%lf",&h);
	 	cons=r*r*h/3;
	 	if(consmayor<cons){
		 	consmayor=cons;
	 	}
	 }
	 else{
	 if(n=='L'){ //cilindro
	 	scanf("%lf",&r);
	 	scanf("%lf",&h);
	 	cons=r*r*h;
	 	if(consmayor<cons){
	 		consmayor=cons;
	 	}
	 	}
	 else{
	 	scanf("%lf",&r);
	 	cons=r*r*r*4/3;
	 	if(consmayor<cons){
	 		consmayor=cons;
	 	}
	 }
}
}
consmayor=consmayor*pi;
printf("%.3f",consmayor);
}
