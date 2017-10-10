
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author luis
 */

class Equipo implements Comparable<Equipo>{
        int id;
        int problemas;
        int app;

        public Equipo(int id, int problemas,int app) {
            this.id = id;
            this.problemas = problemas;
            this.app=app;
        }

        @Override
        public  int compareTo(Equipo o) {
            if(this.problemas!=o.problemas) return o.problemas-this.problemas;
            else return this.app-o.app;
        }
        
    }

public class FinalStanding {
    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int datos=leer.nextInt();
        Vector<Equipo> v=new Vector<Equipo>();
        for (int i = 0; i < datos; i++) {
            v.add(new Equipo(leer.nextInt(),leer.nextInt(),i));
        }
        Collections.sort(v);
        for (int i = 0; i < datos; i++) {
            System.out.println(v.get(i).id+" "+v.get(i).problemas);
        }
    }
}