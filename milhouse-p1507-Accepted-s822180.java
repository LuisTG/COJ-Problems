import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

class Carta implements Comparable<Carta> {

    int valor;
    int palo;
    String carta;

    public Carta(String carta) {
        this.carta = carta;
        char valor = carta.charAt(0);
        char palo = carta.charAt(1);
        switch (valor) {
            case 'A':
                this.valor = 1;
                break;
            case 'T':
                this.valor = 10;
                break;
            case 'J':
                this.valor = 11;
                break;
            case 'Q':
                this.valor = 12;
                break;
            case 'K':
                this.valor = 13;
                break;
            default:
                this.valor = Integer.parseInt("" + valor);
        }
        
        switch(palo){
            case 'S':
                this.palo=1;
                break;
            case 'H':
                this.palo=2;
                break;
            case 'C':
                this.palo=3;
                break;
            case 'D':
                this.palo=4;
                break;
        }
    }

    @Override
    public int compareTo(Carta o) {
        if (this.valor != o.valor) {
            return this.valor-o.valor;
        } else {
            return this.palo-o.palo;
        }
    }
}

public class SortingCards {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int casos=leer.nextInt();
        for (int i = 0; i < casos; i++) {
            Vector<Carta> v=new Vector<Carta>();
            int datos=leer.nextInt();
            for (int j = 0; j < datos; j++) {
                v.add(new Carta(leer.next()));
            }
            Collections.sort(v);
            String s="";
            for (int j = 0; j < datos; j++) {
                s+=v.get(j).carta+" ";
            }
            System.out.println(s.substring(0, s.length()-1));
        }
    }
}