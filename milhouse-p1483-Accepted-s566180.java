
import java.util.Scanner;


public class Problema1483 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String s="";
        int a,b;
        s=leer.next();
        if(s.equals("rectangle")==true){
         a=leer.nextInt();
         b=leer.nextInt();
         a=b*a;
        }
        else{
            a=leer.nextInt();
            a=a*a;
        }
         System.out.println(a);   
    }
 
}
