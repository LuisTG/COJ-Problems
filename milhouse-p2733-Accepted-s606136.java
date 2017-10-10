
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class P2733 {

    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        int cont = Integer.parseInt(leer.readLine());
        for (int i = 0; i < cont; i++) {
            try {
                String aux2 = leer.readLine().replace('.', '#');
                String a[] = aux2.split("#");
                int aux, c = 0;
                if (a.length == 4 || a.length == 6) {
                    for (int b = 0; b < a.length; b++) {
                        aux = Integer.parseInt(a[b]);
                        if (aux > -1 && aux < 256) {
                            c++;
                        }
                    }
                    if (c == a.length) {
                        System.out.println("SI");
                    } else {
                        System.out.println("NO");
                    }
                } else {
                    System.out.println("NO");
                }
            } catch (Exception e) {
                System.out.println("NO");
            }
        }
    }
}
