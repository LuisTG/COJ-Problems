#include<stdio.h>
main(){
	long long int num;
	int casos;
	scanf("%d",&casos);
	while(casos--){
		scanf("%lld",&num);
		int aux=0;
		if(num>1)
		while(num!=0){
			if((num&1)==0){
				aux=1;
				break;
			}
			else{
				num>>=1;
			}
		}
		if(aux==1) printf("YES\n");
		else printf("NO\n");
	}
}