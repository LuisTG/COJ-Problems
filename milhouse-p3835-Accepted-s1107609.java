import java.util.Scanner;

public class ExtendedTraffic {
public static void main(String[] args) throws Exception {
    int V, E, a, b, weight;
    Scanner leer = new Scanner(System.in);
    int casos=leer.nextInt();
    while(casos-->0){
        V=leer.nextInt();
        int []dat=new int[V];
        int[][] AdjMat = new int[V][V];
        int cant;
        for (int l = 0; l < V; l++) {
            dat[l]=leer.nextInt();
            for (int m = 0; m < V; m++) {
                AdjMat[l][m]=1000000000;
            }
            AdjMat[l][l] = 0;
        }
        cant=leer.nextInt();
        for (int m = 0; m < cant; m++) {
            a=leer.nextInt()-1;
            b=leer.nextInt()-1;
            AdjMat[a][b]=(int)Math.pow(dat[b]-dat[a],3);
        }

        for (int k = 0; k < V; k++) 
            for (int i = 0; i < V; i++) 
                for (int j = 0; j < V; j++)
                    if (AdjMat[i][k] + AdjMat[k][j] < AdjMat[i][j]) {
                        AdjMat[i][j] = AdjMat[i][k] + AdjMat[k][j];
                    }
        int q=leer.nextInt();
        int aux;
        for (int l = 0; l < q; l++) {
            aux=leer.nextInt()-1;
            //System.out.println("res "+AdjMat[0][aux]);
            if(AdjMat[0][aux]<3 || AdjMat[0][aux]==1000000000)
                System.out.println("?");
            else
                System.out.println(AdjMat[0][aux]);
        }
    }

   }
}
