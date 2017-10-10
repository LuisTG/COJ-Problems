
import java.util.Scanner;


public class Problema1180 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int casos=leer.nextInt();
        int a,q,r,b,k,p;
        for (int i = 0; i < casos; i++) {
            a=leer.nextInt();
            q=leer.nextInt();
            r=leer.nextInt();
            b=leer.nextInt();
            k=leer.nextInt();
            p=leer.nextInt();
            System.out.printf("%d %d %d %d %d %d\n",1-a,1-q,2-r,2-b,2-k,8-p);
        }
    }
}
