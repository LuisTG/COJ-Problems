import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Steve
 */
public class BFS {

    static entero mapa[][];
    static int tam;
    static int dr[] = {1, 0, -1, 0};
    static int dc[] = {0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        tam = leer.nextInt();
            String ent;
            int cant = 0, max = 0, min = 0, aux = 0;
            mapa = new entero[tam][tam];
            for (int i = 0; i < tam; i++) {
                ent = leer.next();
                for (int j = 0; j < tam; j++) {
                    mapa[i][j] = new entero(ent.charAt(j), i, j);
                }
            }
            for (int i = 0; i < tam; i++) {
                for (int j = 0; j < tam; j++) {
                    if (mapa[i][j].valor == 'm') {
                        cant = floodfill(i, j);
                    }
                }
            }
            System.out.println(cant);
    }

    static int floodfill(int i, int j) {
        Queue<BFS.entero> cola = new ArrayDeque<>();
        cola.add(mapa[i][j]);
        int total = -1;
        while (!cola.isEmpty()) {
            BFS.entero aux = cola.poll();
            //System.out.println(aux.x + " " + aux.y+" suma "+aux.suma);
                        mapa[aux.x][aux.y].visitado=true;
            //mapa[aux.x][aux.y].visitado=true;
            if (mapa[aux.x][aux.y].valor == '#') {
                total = mapa[aux.x][aux.y].suma;
                //System.out.println("hola");
                continue;
            }
            for (int k = 0; k < 4; k++) {
                if (esValido(aux.x + dr[k], aux.y + dc[k])) {
                    if (mapa[aux.x + dr[k]][aux.y + dc[k]].valor != '*' && mapa[aux.x + dr[k]][aux.y + dc[k]].visitado==false) {
                        mapa[aux.x + dr[k]][aux.y + dc[k]].suma = mapa[aux.x][aux.y].suma + 1;
                        mapa[aux.x + dr[k]][aux.y + dc[k]].visitado=true;
                        cola.add(mapa[aux.x + dr[k]][aux.y + dc[k]]);
                    }
                }
            }

        }
        return total;
    }

    static boolean esValido(int r, int c) {
        return (r >= 0 && r < tam && c >= 0 && c < tam);
    }

    static class entero {

        int x;
        int y;
        char valor;
        int suma = 0;
        boolean visitado = false;

        entero(char valor, int x, int y) {
            this.valor = valor;
            this.x = x;
            this.y = y;
        }
    }
}