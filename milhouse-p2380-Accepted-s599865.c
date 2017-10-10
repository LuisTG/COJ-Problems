#include<stdio.h>
main(){
	int n, m,cont;
	scanf("%d",&n);
	while(n--){
		scanf("%d",&m);
		while(m!=0){
			if((m&1)!=0){
				cont++;
			}
			m>>=1;
		}
	}
	printf("%d\n",cont);
}
