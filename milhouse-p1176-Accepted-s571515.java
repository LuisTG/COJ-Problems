
import java.math.BigInteger;
import java.util.Scanner;


public class Problema1176 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        BigInteger num;
        String n2;
        num=leer.nextBigInteger();
        n2=num.toString(3);
        while(n2.charAt(0)!='-'){
            System.out.println(n2);
            num=leer.nextBigInteger();
        n2=num.toString(3);
        }
    }
}
