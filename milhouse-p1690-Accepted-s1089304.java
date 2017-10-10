
import java.util.Scanner;
import java.util.Arrays;


public class BadCowtractors {
    
    static class edge implements Comparable<edge>{
        int o,d,c;

        public edge(int o, int d, int c) {
            this.o = o;
            this.d = d;
            this.c = c;
        }

        @Override
        public int compareTo(edge o) {
            return o.c-this.c;
        }
        
    }
    
    static int padre[];
    
    static void MakeSet(int n) {
        padre=new int[n];
        for (int i = 0; i < n; ++i) {
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
    
    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int n,m;
        n=leer.nextInt();
        m=leer.nextInt();
        MakeSet(n);
        edge ar[]=new edge[m];
        for (int i = 0; i < m; i++) {
            ar[i]=new edge(leer.nextInt()-1,leer.nextInt()-1,leer.nextInt());
        }
        Arrays.sort(ar);
        int num=0;
        int cost=0;
        for (int i = 0; i < m; i++) {
            edge ed = ar[i];
            //System.out.println(ed.c);
            if (!sameComponent(ed.o, ed.d)) {
                // System.out.println("hola");
                num++;
                cost += ed.c;
                Union(ed.o, ed.d);
            }
        }
        if(n-1!=num){
            System.out.println("-1");
        }else{
            System.out.println(cost);
        }
    }
}
