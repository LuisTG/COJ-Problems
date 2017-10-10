
import java.util.Scanner;

public class P2634 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int a[]=new int[13];
        int empleados=leer.nextInt();
        for(int i=0; i<empleados;i++){
            String des=leer.next();
            String x=leer.next();
            String m[]=x.split("/");
            int aux=Integer.parseInt(m[1]);
            a[aux]++;
        }
        for(int i=1;i<13;i++){
            System.out.println(i+" "+a[i]);
        }
    }
}
