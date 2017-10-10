
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Jugador implements Comparable<Jugador> {

    String nombre;
    int id;
    int oro;
    int plata;
    int bronce;

    Jugador(int id, String nombre, int oro, int plata, int bronce) {
        this.id=id;
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
                    return o.id-this.id;
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
        ArrayList<Jugador> j=new ArrayList();
        for (int i = 0; i < 7; i++) {
            Jugador j1=new Jugador(i+1,"Facultad",leer.nextInt(),leer.nextInt(),leer.nextInt());
            j.add(j1);
        }
            Collections.sort(j);
            for(int i=0;i<7;i++){
                Jugador j2=j.get(i);
                System.out.println(j2.nombre+" "+j2.id+" "+j2.oro+" "+j2.plata+" "+j2.bronce);
            }
        }
    }
