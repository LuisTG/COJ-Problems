
import java.util.Scanner;


public class FactorialPrimos {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
	long n=1,i;
	double cuadratica,result,aux,j;
	int num,cont=0;
	num=leer.nextInt();
	while(num!=0){
		for( i=1;i<=num;i++){
			cuadratica=Math.sqrt(i);
			for ( j = 2; j <= cuadratica; j++) {
            if(j!=i){
			result=(i/j);
            if (result==(int)result) {
                cont++;
                break;
            }
        }
        }
            if(cont==0){
            	n=  (long) (n*i);
            }
            cont=0;
		}
		          System.out.printf("%d\n",n);
		n=1;
            num=leer.nextInt();
	
}
}
    }
