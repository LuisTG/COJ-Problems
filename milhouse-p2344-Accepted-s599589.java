
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Jugador implements Comparable<Jugador> {

    String nombre;
    int oro;
    int plata;
    int bronce;

    Jugador(String nombre, int oro, int plata, int bronce) {
        this.nombre = nombre;
        this.oro = oro;
        this.plata = plata;
        this.bronce = bronce;
    }

    @Override
    public int compareTo(Jugador o) {
        if (this.oro == o.oro) {
            if (this.plata == o.plata) {
                if (this.bronce == o.bronce) {
                    return this.nombre.compareTo(o.nombre);
                } else {
                    return o.bronce-this.bronce;
                }
            } else {
                return o.plata-this.plata;
            }
        } else {
            return o.oro - this.oro;
        }
    }
}

public class main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Jugador> j=null;
        int cont = 1;
        String nombre="";
        while (cont != 0) {
            j = new ArrayList<>();
           nombre = leer.next();
           while(nombre.equals("@")==false && nombre.equals("#")==false){
                    j.add(new Jugador(nombre, leer.nextInt(), leer.nextInt(), leer.nextInt()));
                    nombre = leer.next();
            }

            Collections.sort(j);
            for (Jugador x : j) {
                System.out.println(x.nombre);
            }
            if (nombre.equals("#") == true) {
                cont = 0;
            } else {
                System.out.println("@");
            }
        }
    }
}
