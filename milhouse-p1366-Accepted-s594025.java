
import java.util.Scanner;

public class Problema1366 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int casos=leer.nextInt();
        int suma=0;
     for(int i=0;i<casos;i++){
     StringBuilder suerte=new StringBuilder();
     suerte.append(Integer.toBinaryString(leer.nextInt()));
     suerte=suerte.reverse();
         for (int j = 0; j < suerte.length(); j++) {
             if(suerte.charAt(j)=='1'){
             suma+=Math.pow(5,j+1);
             }
         }
         System.out.println(suma);
         suma=0;
     }   
    }
}