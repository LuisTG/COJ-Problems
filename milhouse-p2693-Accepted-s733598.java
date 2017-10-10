
import java.util.Scanner;


public class num {
    public static void main(String[] args) {
            Scanner leer=new Scanner(System.in);
            double num,num2;
            num=leer.nextDouble();
            num2=leer.nextDouble();
            num2=Math.pow(10, num2);
            num=Math.round((num*num2))/num2;
            System.out.println(num);
    }
}