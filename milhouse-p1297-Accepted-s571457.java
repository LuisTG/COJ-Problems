
import java.math.BigInteger;
import java.util.Scanner;


public class Problema1297 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        BigInteger div=new BigInteger("495");
        String num;
        int casos=leer.nextInt();
        for (int i = 0; i < casos; i++) {
            num=""+leer.nextBigInteger().mod(div);
            if(num.equals("0")==true){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
