
import java.util.Scanner;

public class Problema1099 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num[] = new int[10];
        int cont = 1;
        num[cont] = leer.nextInt();
        while (num[cont] != 0) {
            num[cont] = num[cont] * num[cont];
            if (cont == 3) {
                if (num[1] + num[2] == num[3] || num[2] + num[3] == num[1] || num[1] + num[3] == num[2]) {
                    System.out.println("right");
                    cont=0;
                } else {
                    System.out.println("wrong");
                    cont=0;
                }
            }
            cont++;
            num[cont] = leer.nextInt();
        }
    }
}