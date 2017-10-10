
import java.util.Scanner;


public class Problema2620 {
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
        String a="A";
        int x=leer.nextInt();
        x=x*4;
        for(int i=1;i<=x;i++){
        a=a+"a";
        }
        a=a+"h";
        System.out.println(a);
    }
}
