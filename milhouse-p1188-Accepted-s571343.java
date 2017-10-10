
import java.util.Scanner;


public class Problema1188 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String n1=leer.next();
        String n2=leer.next();
        int num1=0,num2=0;
        for (int i = 0; i < n1.length(); i++) {
            num1=num1+Integer.parseInt(""+n1.charAt(i));
        }
        for (int i = 0; i < n2.length(); i++) {
            num2=num2+Integer.parseInt(""+n2.charAt(i));
        }
        System.out.println(num1*num2);
    }
}
