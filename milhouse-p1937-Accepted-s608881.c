#include<stdio.h>
#include<math.h>
main(){
	long long int a;
	scanf("%lld",&a);
	int cont;
	while(a!=0){
		long long int result;
		result=ceil(((sqrt(((a*2)*4)+9))+3)/2);
                printf("Case %d: %lld\n",++cont,result);
		scanf("%lld",&a);
	}
}