import java.util.Scanner;


public class gamewithNumbers {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int ar[] = new int[22];
        ar[0] = 1;
        for (int i = 1; i < 22; i++) {
            ar[i] = 2 * ar[i - 1];
        }
        while (leer.hasNext()) {
            int n = leer.nextInt();
            int x = leer.nextInt();
            System.out.print((int) (Math.log10(n) / Math.log10(2) + 1));
            int aux = (int) (Math.log10(n) / Math.log10(2));
            System.out.print(" " + ar[aux]);
            if (x % 2 == 1) {
                System.out.println(" 1");
            } else {
                for (int i = 21; i > 0; i--) {
                    if (x % ar[i] == 0) {
                        System.out.println(" " + (i + 1));
                        i = 0;
                    }
                }
            }
        }
    }
}
