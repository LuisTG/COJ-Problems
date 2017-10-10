
import java.util.Scanner;

public class Problema1495 {

    public static void main(String[] args) {
        Integer num[] = new Integer[1000];
        int aux = 0;
        Scanner leer = new Scanner(System.in);
        int n = leer.nextInt();
        for (int j = 0; j < n; j++) {
            num[j] = leer.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (num[i] > num[j]) {
                    aux = num[i];
                    num[i] = num[j];
                    num[j] = aux;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(num[i]);
        }
    }
}
