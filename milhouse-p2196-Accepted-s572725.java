
import java.math.BigInteger;
import java.util.Scanner;


public class Problema2196 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        BigInteger num;
        int casos=leer.nextInt();
        for (int i = 0; i < casos; i++) {
            num=leer.nextBigInteger();
            if (num.mod(new BigInteger("2"))==BigInteger.ZERO) {
                System.out.println("even");
            }
            else{
                System.out.println("odd");
            }
        }
    }
}
