
import java.math.BigInteger;
import java.util.Scanner;

public class Problema1407 {
    public static void main(String[] args) {
   Scanner leer=new Scanner(System.in);
   BigInteger suma,diferencia,segundo,dos=new BigInteger("2");
        for (int i = 0; i < 10; i++) {
            suma=leer.nextBigInteger();
            diferencia=leer.nextBigInteger();
            suma=suma.add(diferencia);
            suma=suma.divide(dos);
            segundo=suma.subtract(diferencia);
            System.out.println(suma);
            System.out.println(segundo);
        }
}
}
