import java.util.Scanner;

public class ParImpar {

    static int datos[][] = new int[19][19];

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int p, i;
        long result;
        p = leer.nextInt();
        i = leer.nextInt();
        while (p != 0 || i != 0) {
            busqueda(p, i);
            if(p==1 && i==0) System.out.println("9");
            else {
            if (p == 0) {
                result = (long) Math.pow(5, i + p);
            } else if (i == 0) {
                result = (long) (Math.pow(5, i + p - 1) * 4);
            } else {
                //System.out.println(datos[p][i]+" "+datos[p-1][i]+" "+datos[p][i-1]);
                result = (datos[p][i-1] * (long) Math.pow(5, i + p)) + (datos[p-1][i] * 4 * (long) Math.pow(5, i + p - 1));
            }
            System.out.println(result * 2);}
            p = leer.nextInt();
            i = leer.nextInt();
        }
    }

    public static int busqueda(int p, int i) {
        if (p == 0 || i == 0) {
            return datos[p][i] = 1;
        }
        if (datos[p][i] != 0) {
            return datos[p][i];
        }
        int a = busqueda(p - 1, i) + busqueda(p, i - 1);
        return datos[p][i] = a;
    }
}
