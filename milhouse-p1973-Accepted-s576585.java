
import java.math.BigInteger;
import java.util.Scanner;


public class Problema1973 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        BigInteger num,siete=new BigInteger("17");
        num=leer.nextBigInteger(2);
        String n=num.toString(10);
        BigInteger con=new BigInteger(""+n);
        con=con.multiply(siete);
        n=con.toString(2);
        System.out.println(n);
        
    }
}
