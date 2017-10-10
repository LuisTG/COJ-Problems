
import java.math.BigInteger;
import java.util.Scanner;

public class Problema2413 {
   public static void main(String[] args) {
   Scanner leer=new Scanner(System.in);
   String num;
   char res;
   int n=leer.nextInt();
       for (int i = 0; i < n; i++) {
           num=leer.next();
           res=num.charAt(num.length()-1);
           if(res=='5'||res=='0'){
               System.out.println("YES");
           }
           else {
               System.out.println("NO");
           }
       }
   }
}
   
