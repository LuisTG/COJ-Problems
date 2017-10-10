

import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Steve
 */
public class Problema1456 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TreeSet m= new TreeSet();
        Scanner leer=new Scanner(System.in);
        int n=leer.nextInt();
        long j;
        for (int i = 0; i < n; i++) {
            j=leer.nextLong();
            if(m.remove(j)==false){
                m.add(j);
            }
        }
        System.out.println(m.first());
    }
}
