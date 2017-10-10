import java.util.*;

public class Network {

    static final int MAX = 1005;
    static int padre[] = new int[MAX];

    static void MakeSet(int n) {
        for (int i = 1; i <= n; ++i) {
            padre[i] = i;
        }
    }

    static int Find(int x) {
        return (x == padre[x]) ? x : (padre[x] = Find(padre[x]));
    }

    static void Union(int x, int y) {
        padre[Find(x)] = Find(y);
    }

    static boolean sameComponent(int x, int y) {
        if (Find(x) == Find(y)) {
            return true;
        }
        return false;
    }
    static int V, E;

    static class Edge implements Comparator<Edge> {

        int origen;
        int destino;
        double peso;
        int grado = 0;

        Edge() {
        }

        @Override
        public int compare(Edge e1, Edge e2) {
            if (e1.grado < e2.grado) {
                return -1;
            } else if (e1.grado < e2.grado) {
                return -1;
            } else {
                if (e1.peso == e2.peso) {
                    return 0;
                } else if (e1.peso < e2.peso) {
                    return -1;
                } else {
                    return 1;
                }
            }
        }
    };

    static class Puntos {

        int num;
        int x;
        int y;
    }
    static Puntos pun[] = new Puntos[11];
    static Edge arista[] = new Edge[MAX];
    static Edge MST[] = new Edge[MAX];
    static int amigos[] = new int[MAX];
    static TreeSet<Double> tree = new TreeSet();
    static Edge mat[][];

    static void KruskalMST() {
        int origen, destino;
        double total = 0, peso;
        Edge aux;
        MakeSet(V);
        Arrays.sort(arista, 0, E, new Edge());
        /*for (int i = 0; i < E; i++) {
            System.out.println(arista[i].origen + " " + arista[i].destino + " " + arista[i].peso + " " + arista[i].grado);
        }*/
        for (int i = 0; i < E; ++i) {
            origen = arista[i].origen;
            destino = arista[i].destino;
            peso = arista[i].peso;

            if (!sameComponent(origen, destino) && amigos[origen] < 2 && amigos[destino] < 2) {
                total += peso;
                //System.out.println(origen + " " + destino);
                Union(origen, destino);
                amigos[origen]++;
                amigos[destino]++;
            }
        }
        System.out.format("%.2f\n", total);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        V = sc.nextInt();
        E = ((V) * (V - 1)) / 2;
        for (int i = 1; i <= V; i++) {
            pun[i] = new Puntos();
            pun[i].x = sc.nextInt();
            pun[i].y = sc.nextInt();
        }
        int H = V, j = 1;
        Edge aux = new Edge();
        aux.peso = 10000000;
        for (int i = 0; i < E; ++i) {
            int origen, destino;
            if (H - j == 0) {
                H--;
                j = 1;
            }
            origen = H;
            destino = H - j;
            arista[i] = new Edge();
            arista[i].origen = origen;
            arista[i].destino = destino;
            arista[i].peso = Math.hypot(pun[destino].x - pun[origen].x, pun[destino].y - pun[origen].y);
            amigos[i] = 0;
            j++;
        }
        Arrays.sort(arista, 0, E, new Edge());
        mat = new Edge[V][V - 1];
        for (int i = 0; i < V; i++) {
            int con = 0;
            for (int k = 0; k < E; k++) {
                if (arista[k].origen == (i + 1) || arista[k].destino == (i + 1)) {
                    mat[i][con] = arista[k];
                    con++;
                }
            }
            Arrays.sort(mat[i], 0, V - 1, new Edge());
        }
        for (int i = 0; i < V; i++) {
            mat[i][0].grado = -1;
        }
        KruskalMST();
    }
}