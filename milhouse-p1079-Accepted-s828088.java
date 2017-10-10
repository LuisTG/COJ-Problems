import java.util.Scanner;

public class SumsInATriangule {

    static int[][] ar;
    static int n;
    static int[][] ar2;
    static int sum;

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int casos = leer.nextInt();
        for (int i = 0; i < casos; i++) {
            n = leer.nextInt();
            ar = new int[n][n];
            ar2 = new int[n][n];
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    ar2[j][k] = -1;
                }
            }
            for (int j = 0, k = 1; j < n; j++, k++) {
                for (int l = 0; l < k; l++) {
                    ar[j][l] = leer.nextInt();
                }
            }
            System.out.println(consultar(0, 0));
        }
    }

    static int consultar(int x, int y) {

        if (x >= n || y >= n) {
            return 0;
        }
        if (ar2[x][y] != -1) {
            return ar2[x][y];
        }
        sum = Math.max(consultar(x + 1, y)+ar[x][y], consultar(x+1, y + 1)+ar[x][y]);
        return ar2[x][y] = sum;
    }

}