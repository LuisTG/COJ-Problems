
import java.util.Scanner;


public class Problema1683 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int a=leer.nextInt();
        int b,suma=0;
        for (int i = 0; i < a; i++) {
            b=leer.nextInt();
            for (int j = 1; j < b; j++) {
                if (b%j==0) {
                   suma=suma+j; 
                }
            }
            if(suma<b){
                System.out.println("Deficient");
            }
            if (suma>b) {
                System.out.println("Abundant");
            }
            if (suma==b) {
                System.out.println("Perfect");
            }
            suma=0;
        }
    }
}
