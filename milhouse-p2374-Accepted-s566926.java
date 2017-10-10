
import java.util.Scanner;


public class Problema2374 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Integer num[]=new Integer [4];
        String num1=leer.next();
        String num2=leer.next();
        num1=num1.replace("6", "5");
        num2=num2.replace("6", "5");
         num[0]=Integer.parseInt(num1, 10)+Integer.parseInt(num2,10);
        num1=num1.replace("5", "6");
        num2=num2.replace("5", "6");
         num[1]=Integer.parseInt(num1, 10)+Integer.parseInt(num2,10);
        System.out.println(num[0]+" "+num[1]);
    }
}
