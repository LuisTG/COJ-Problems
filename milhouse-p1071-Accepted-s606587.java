
import java.math.BigInteger;
import java.util.Scanner;


public class Problema1071 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        BigInteger a,dos=new BigInteger("2");
        while(leer.hasNext()){
            a=leer.nextBigInteger();
            if(a.equals(BigInteger.ONE)){
                System.out.println(a);
            }
            else{
            a=a.multiply(dos);
            a=a.subtract(dos);
            System.out.println(a);
            }
        }
    }
}
