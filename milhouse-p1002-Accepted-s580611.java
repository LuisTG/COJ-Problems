
import java.util.Scanner;


public class XDDD {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n = leer.nextInt();
        for (int i = 0; i < n; i++) {
            int m = leer.nextInt();
            String linea[] = new String[m];
            for (int j = 0; j < m; j++) {
                linea[j] = leer.next();
            }
            int mayor=0;
            for (int j = 0; j < m; j++) {
                if (linea[j].contains(".")) {
                    mayor=1;
                    break;
                }
                
            }
            String aux;
            int cont=1,guard=0;
            for (int x = 0; x < m; x++) {
            for (int j = 0; j < m; j++) {
                for (int k = j+2; k < m+1; k++) {
                    aux=linea[x].substring(j, k);
                    if (aux.contains("#")==false) {
                        for (int z = x + 1; z < m; z++) {
                            if (linea[z].substring(j, k).equals(aux)==true) {
                                cont++;
                                guard = k - j;
                            } else {
                                break;
                            }
                        }
                        if (guard == cont) {
                            if (mayor < guard) {
                                mayor = guard;
                            }
                    }
                        cont=1;
                }
            }
            }
        }
            System.out.println(mayor);
        }
    }
}