import java.util.Scanner;
import java.util.Arrays;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luis
 */
class pair implements Comparable<pair>{
    int f;
    int s;

    public pair(int f, int s) {
        this.f = f;
        this.s = s;
    }

    @Override
    public int compareTo(pair o) {
        if(this.f!=o.f)
        return this.f-o.f;
        return this.s-o.s;
        
    }
     
}
public class MoroviaTelecom {
    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int n=leer.nextInt();
        pair mat[]=new pair[n];
        int ind=0;
        int m=n;
        while(m-->0){
            mat[ind++]=new pair(leer.nextInt(),leer.nextInt());            
        }
        Arrays.sort(mat);
        int in=0,fin=0;
        boolean band=false;
        int cont=0;
        StringBuilder s=new StringBuilder();
        for (int i = 0; i < n;) {
            if(!band){
                in=mat[i].f;
                fin=mat[i].s;
                s.append(mat[i].f);
                band=true;
                i++;
                cont++;
            }else{
                if(fin+1<mat[i].f){
                   s.append(" ").append(fin).append("\n");
                   band=false;
                }else{
                    fin=Math.max(fin, mat[i].s);
                    band=true;
                    i++;
                }
            }
        }
        s.append(" ").append(fin).append("\n");
            System.out.println(cont);
            System.out.print(s.toString());
    }
}
