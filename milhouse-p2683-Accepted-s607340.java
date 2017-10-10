
import java.util.Scanner;

public class P2683 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int casos=leer.nextInt();
        for (int i = 0; i < casos; i++) {
            int a=leer.nextInt();
            int b=leer.nextInt();
            String x=Integer.toString(a, b);
            x=x.toUpperCase();
            System.out.println(x);
        }
    }
}
