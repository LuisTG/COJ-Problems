
import java.util.Scanner;

public class Probelma2700 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String a = leer.next();
        String b = leer.next();
        String c = "", d = "";
        char aux;
        char num[] = new char[a.length()];
        char num2[] = new char[b.length()];
        for (int i = 0, z = 0; i < a.length(); i++) {
            aux = a.charAt(i);
            if (aux != '.') {
                c = c + aux;
                num[z] = aux;
                z++;
            }
            a = a.replace(aux, '.');
        }
        for (int i = 0, z = 0; i < b.length(); i++) {
            aux = b.charAt(i);
            if (aux != '.') {
                d = d + aux;
                num2[z] = aux;
                z++;
            }
            b = b.replace(aux, '.');
        }

        for (int i = 0; i < c.length(); i++) {
            for (int x = i + 1; x < c.length(); x++) {
                if (num[i] > num[x]) {
                    aux = num[i];
                    num[i] = num[x];
                    num[x] = aux;
                }
            }
        }
        for (int i = 0; i < d.length(); i++) {
            for (int x = i + 1; x < b.length(); x++) {
                if (num2[i] > num2[x]) {
                    aux = num2[i];
                    num2[i] = num2[x];
                    num2[x] = aux;
                }
            }
        }
        int cont = 0;
        System.out.printf("First:");
        for (int i = 0; i < c.length(); i++) {
            for (int x = 0; x < d.length(); x++) {
                if (num[i] == num2[x]) {
                    cont++;
                }
            }
            if (cont == 0) {
                System.out.printf("%c", num[i]);
            }
            cont = 0;
        }
        System.out.println("");
        cont = 0;
        System.out.printf("Second:");
        for (int i = 0; i < d.length(); i++) {
            for (int x = 0; x < c.length(); x++) {
                if (num[x] == num2[i]) {
                    cont++;
                }
            }
            if (cont == 0) {
                System.out.printf("%c", num2[i]);
            }
            cont = 0;
        }
        System.out.println("");
        cont = 0;
        System.out.printf("First&Second:");
        for (int i = 0; i < c.length(); i++) {
            for (int x = 0; x < d.length(); x++) {
                if (num[i] == num2[x]) {
                    cont++;
                }
            }
            if (cont > 0) {
                System.out.printf("%c", num[i]);
            }
            cont = 0;
        }
        System.out.println("");
    }
}
