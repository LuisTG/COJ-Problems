
import java.util.Scanner;

public class Problema1688 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int op = leer.nextInt();
        int alt,anch;
        while (op != -1) {
            if (op == 1) {
                alt = leer.nextInt();
                int ast = alt, esp = alt - 1;
                for (int i = 0; i < alt; i++) {
                    for (int j = 0; j < ast; j++) {
                        if (j < esp) {
                            System.out.print(" ");
                        } else {
                            System.out.print("*");
                        }
                    }
                    System.out.println("");
                    esp--;
                    ast++;
                }
                System.out.println("");
            }
            if (op == 2) {
                 anch = leer.nextInt();
                 alt = leer.nextInt();
                int alt2 = alt;
                int n = anch + alt - 1;
                for (int i = 0; i < alt; i++) {
                    for (int j = 1; j <= n; j++) {
                        if (j < alt2) {
                            System.out.print(" ");
                        } else {
                            System.out.print("*");
                        }
                    }
                    n--;
                    alt2--;
                    System.out.println("");

                }
                System.out.println("");
            }
            if (op == 3) {
                 anch = leer.nextInt();
                 alt = leer.nextInt();
                for (int i = 0; i < alt; i++) {
                    for (int j = 0; j < anch; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                System.out.println("");
            }
             op = leer.nextInt();
        }
    }
}
