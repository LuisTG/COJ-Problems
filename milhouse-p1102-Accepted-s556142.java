
import java.math.BigInteger;
import java.util.Scanner;

public class Problema1102 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        BigInteger num = leer.nextBigInteger();
        BigInteger compa = new BigInteger("11");
        BigInteger cer = BigInteger.ZERO;
        while (num.compareTo(cer) != 0) {
            if (num.mod(compa) == cer) {
                System.out.println(num + " is a multiple of 11.");
            } else {
                System.out.println(num + " is not a multiple of 11.");
            }
            num = leer.nextBigInteger();
        }
    }
}
