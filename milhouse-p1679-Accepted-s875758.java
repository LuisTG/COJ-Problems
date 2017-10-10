import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Steve
 */
public class Fifa {

    static class Jugador implements Comparable<Jugador> {

        String name;
        double factor;

        public Jugador(String name, double factor) {
            this.name = name;
            this.factor = factor;
        }

        @Override
        public int compareTo(Jugador o) {
            return (int) (this.factor - o.factor); //To change body of generated methods, choose Tools | Templates.
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n = leer.nextInt();
        Jugador[] j = new Jugador[n];
        String name;
        for (int i = 0; i < n; i++) {
            name = leer.next();
            j[i] = new Jugador(name, Math.log10(leer.nextInt()) + leer.nextInt() + 2 * leer.nextInt() + leer.nextInt() - (leer.nextInt() + 2 * leer.nextInt()));
        }
        Arrays.sort(j);
        System.out.println(j[n - 1].name);
    }

}
