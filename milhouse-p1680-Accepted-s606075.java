
import java.util.Scanner;

public class Problema1925 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        while (leer.hasNext()) {
            String x = leer.next();
            String z = leer.next();
            int largo1=0, largo2=1;
            while (largo1 < largo2) {
                largo2=x.length();
                x=x.replaceFirst(z, "");
                largo1=x.length();
            }
            System.out.println(x);
        }
    }
}
