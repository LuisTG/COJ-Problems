
import java.util.Scanner;

public class Problema1069 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int n=leer.nextInt();
        int a,b,c,aux1,cont=0;
        for (int i = 0; i < n; i++) {
            a=leer.nextInt();
            b=leer.nextInt();
            c=leer.nextInt();
            aux1=a+b;
            while(aux1>=c){
                aux1=aux1-c+1;
                cont++;
                if(c==1&&aux1>0){
                    cont=0;
                break;
                }
            }
            System.out.println(cont);
            cont=0;
        }
    }
}
