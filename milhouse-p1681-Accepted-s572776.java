
import java.util.Scanner;


public class Problema1681 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        double a,b,c,x1,x2;
        a=leer.nextDouble();
        b=leer.nextDouble();
        c=leer.nextDouble();
        x1=(-b+Math.sqrt(Math.pow(b,2)-(4*a*c)))/2*a;
        x2=(-b-Math.sqrt(Math.pow(b,2)-(4*a*c)))/2*a;
        String comp=""+x1;
        String comp2=""+x2;
        if ((comp.equals("NaN")==false) || (comp2.equals("NaN")==false)) {
            System.out.println("YES");
            
        }
        else 
            System.out.println("NO");
    }
}
