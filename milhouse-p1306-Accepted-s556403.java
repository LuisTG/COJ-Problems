
import java.math.BigInteger;
import java.util.Scanner;

public class Problema1306 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        BigInteger num = new BigInteger("0");
        BigInteger cuatro = new BigInteger("4");
        BigInteger cer = BigInteger.ZERO;
        int casos = leer.nextInt();
        for (int i = 1; i <= casos; i++) {
            num = leer.nextBigInteger();
            if (num.mod(cuatro) == cer) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
