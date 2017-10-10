
import java.util.Scanner;


public class Problema2149 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
       int casos=leer.nextInt();
        for (int i = 0; i < casos; i++) {
            int cant[]={0,0};
            String palabra=leer.next();
            char pal[]=palabra.toCharArray();
            for (int j = 0; j < pal.length; j++) {
                if(pal[j]>96&&pal[j]<123) cant[0]++;
                else cant[1]++;
            }
            if (cant[0]==cant[1]) System.out.println("SI");
            else System.out.println("NO");
            }
        }
    }
