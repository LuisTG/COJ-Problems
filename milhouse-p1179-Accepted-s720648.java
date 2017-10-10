
import java.util.Scanner;


public class P1179 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int casos=leer.nextInt();
        for (int i = 0; i < casos; i++) {
            int num=leer.nextInt();
            int menor=100, mayor=0,dato;
            for (int j = 0; j < num; j++) {
                dato=leer.nextInt();
                if(dato>mayor) {mayor=dato;}
                if(dato<menor) {menor=dato;}
            }
            System.out.println((mayor-menor)*2);
        }
    }
}