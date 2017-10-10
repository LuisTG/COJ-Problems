
import java.util.Scanner;

public class Problema1318 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Integer ord[] = new Integer[3];
        Integer ordd[] = new Integer[3];

        String orde;
        int aux;
        for (int i = 0; i < 3; i++) {
            ord[i] = leer.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (ord[i] > ord[j]) {
                    aux = ord[i];
                    ord[i] = ord[j];
                    ord[j] = aux;
                }
            }
        }
        orde = leer.next();
        for (int i = 0; i < orde.length(); i++) {
            if (orde.charAt(i) == 'A') {
                ordd[i] = ord[0];
            }
            if (orde.charAt(i) == 'B') {
                ordd[i] = ord[1];
            }
            if (orde.charAt(i) == 'C') {
                ordd[i] = ord[2];
            }
        }
        System.out.println(ordd[0] + " " + ordd[1] + " " + ordd[2]);
    }
}