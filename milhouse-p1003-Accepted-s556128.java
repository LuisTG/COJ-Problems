
import java.util.Scanner;

public class Problema1003 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int l = 1, suma = 0, mayor = 0, cont = 0;
        int guard[] = new int[1001];
        int t = leer.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = leer.nextInt();
            int m = leer.nextInt();
            for (int j = 1; j <= m; j++) {
                for (int k = 1; k <= n; k++) {
                    guard[l] = leer.nextInt();
                    l++;
                }
            }
            for (int s = 1; s <= n; s++) {
                for (int f = s; f <= m * n; f = f + n) {
                    suma = suma + guard[f];
                }
                if (mayor < suma) {
                    mayor = suma;
                    cont = s;
                }
                suma = 0;
            }
            System.out.println(cont);
            mayor = 0;
            l=1;
        }
    }
}
