import java.util.Scanner;

/**
 *
 * @author Steve
 */
public class CountingIsland {

    static int R, C;
    static int dr[] = {1, 1, 0, -1, -1, -1, 0, 1};
    static int dc[] = {0, 1, 1, 1, 0, -1, -1, -1};
    static char mapa[][];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int tam = leer.nextInt();
        while (tam != 0) {
            R = C = tam;
            String ent;
            int cant = 0, max = 0, min = 0,aux=0;
            mapa = new char[tam][tam];
            for (int i = 0; i < tam; i++) {
                ent = leer.next();
                for (int j = 0; j < tam; j++) {
                    mapa[i][j] = ent.charAt(j);
                }
            }
            for (int i = 0; i < tam; i++) {
                for (int j = 0; j < tam; j++) {
                    if(mapa[i][j]=='l'){
                        cant++;
                        if(cant==1){
                            max=min=floodfill(i,j,'l','s');
                        }else{
                            aux=floodfill(i,j,'l','s');
                            if(max<aux) max=aux;
                            if(min>aux) min=aux;
                        }
                    }
                }
            }
            System.out.println(cant+" "+min+" "+max);
            tam=leer.nextInt();
        }
    }

    public static int floodfill(int r, int c, char c1, char c2) { //Retorna el tamaño del CC
        if (!esValido(r, c)) {
            return 0; //Fuera de la cuadrícula
        }
        if (mapa[r][c] != c1) {
            return 0; //No es de color c1
        }
        int ans = 1; //Suma 1 a ans porque el vérice (r,c) es de color c1
        mapa[r][c] = c2; //Colorea el vértice con c2, para evitar ciclos
        for (int d = 0; d < 8; d++) {
            ans += floodfill(r + dr[d], c + dc[d], c1, c2);
        }
        return ans;
    }

    public static boolean esValido(int r, int c) {
        return (r >= 0 && r < R && c >= 0 && c < C);
    }

}
