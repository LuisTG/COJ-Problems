
import java.util.Scanner;


public class Problema1177 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int n=leer.nextInt();
        int aux;
        int largo;
        String c,completo="";
        while(n!=0){
            c=leer.next();
            largo=c.length()/n;
            int x=largo;
            aux=n;
            String pedazos[]=new String[n];
            for (int i = 0,cont=0; cont <aux; i=i+largo,cont++) {
                pedazos[cont]=c.substring(i, x);
                x=x+largo;
            }
            for (int i = 0; i<n; i++) {
                for (int j = pedazos[i].length()-1; j >=0; j--) {   
                   completo=completo+pedazos[i].charAt(j);
            }
            }
            System.out.println(completo);
            completo="";
            n=leer.nextInt();
        }
    }
}
