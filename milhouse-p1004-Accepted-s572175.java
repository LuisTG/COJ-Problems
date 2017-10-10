
import java.util.Scanner;

public class Problema1004 {
public static void main(String[] args) {
   Scanner leer=new Scanner(System.in);
   int casos=leer.nextInt();
   int n1,n2;
    for (int i = 0; i < casos; i++) {
        n1=leer.nextInt();
        n2=leer.nextInt();
        if(n1<=n2){
            if(n1%2==0){
                System.out.println("L");
            }
            else
            {
                System.out.println("R");
            }
        }
        else{
            if(n2%2==0){
                System.out.println("U");
            }
            else
            {
                System.out.println("D");
            }
            }
                
        }
    }
}
    
