
import java.util.Scanner;

public class Problema1330 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String bebida[] = {"ABSINTH", "BEER", "BRANDY", "CHAMPAGNE", "GIN", "RUM", "SAKE", "TEQUILA", "VODKA", "WHISKEY", "WINE"};
        String resp;
        int aux, n, p, cont = 0;
        n = leer.nextInt();
        for (int i = 0; i < n; i++) {
            p = leer.nextInt();
            for (int j = 0; j < p; j++) {
                resp = leer.next();
                if (Character.isLetter(resp.charAt(0))==true) {
                    for (int s = 0; s < bebida.length; s++) {
                        if (resp.equals(bebida[s]) == true) {
                            cont++;
                        }
                    }
                } else {
                    aux = Integer.parseInt(resp, 10);
                    if (aux < 18) {
                        cont++;
                    }
                }
            }
            System.out.println(cont);
            cont=0;
        }
    }
}
