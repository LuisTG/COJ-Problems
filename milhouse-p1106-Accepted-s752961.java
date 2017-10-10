
import java.util.Scanner;

public class Problema1106 {


    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int p1=0,p2=0;
        int n=leer.nextInt()/2;
        for (int i = 0; i < n; i++) {
            p1=p1+leer.nextInt();
            p2=p2+leer.nextInt();
        }
        if(p1>p2)
        System.out.println(p1+" "+p2);
        else
            System.out.println(p2+" "+p1);
    }
    
}
