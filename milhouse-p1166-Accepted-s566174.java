
import java.util.Scanner;

public class Problema1166 {
    public static void main(String[] args) {
   Scanner leer=new Scanner(System.in);
   int par=0,impar=0,n,p,num; 
   n=leer.nextInt();
   for(int i=0;i<n;i++){
       p=leer.nextInt();
       for(int j=0;j<p;j++){
       num=leer.nextInt();
       if(num%2==0)
           par++;
       else
           impar++;
       }
       System.out.printf("%d even and %d odd.\n",par,impar);
       par=0;
       impar=0;
   }
}
}
