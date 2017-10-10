
import java.math.BigInteger;
import java.util.Scanner;


public class Problema1293 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int num=leer.nextInt();
        BigInteger dos=new BigInteger("2");
        dos=dos.pow(num);
        System.out.println(dos);
    }
}
