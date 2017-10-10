
import java.util.Scanner;

public class Problema1595 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String z, n = leer.next();
        int x = 1, suma = 0, cont = 0;
        while (n.equals("0") != true) {
            z = n;
            while (x > 0) {
                for (int i = 0; i < n.length(); i++) {
                    suma += n.charAt(i) - 48;
                }
                if (suma % 9 != 0) {
                    break;
                } else {
                    cont++;
                    n = "" + suma;
                }
                if (suma == 9) {
                    x = 0;
                }
                suma = 0;
            }
            if (cont != 0) {
                System.out.printf("%s is a multiple of 9 and has 9-degree %d.\n", z, cont);
            } else {
                System.out.printf("%s is not a multiple of 9.\n", z);
            }
            n = leer.next();
            suma = cont = 0;
            x = 1;
        }
    }
}
