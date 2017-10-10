
import java.util.Scanner;

public class Problema2420 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int n=leer.nextInt();
        StringBuilder revers;
        String aux;
        for (int i = 0; i < n; i++) {
            String binario=Integer.toBinaryString(leer.nextInt());
            revers=new StringBuilder(binario);
            revers.reverse();
            aux=revers.toString();
            if (binario.equals(aux))       System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
