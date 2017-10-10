
import java.util.Scanner;

public class Problema2698 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String pal = leer.next();
        String aux;
        int suma = 0;
        String con[] = {"0", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        for (int i = 0; i < pal.length(); i++) {
            aux = "" + pal.charAt(i);
            for (int j = 1; j <= 26; j++) {
                if (con[j].equals(aux) == true) {
                    suma = suma + j;
                }
            }
        }
        System.out.println(suma);
    }
}
