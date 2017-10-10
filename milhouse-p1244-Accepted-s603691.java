
import java.util.Scanner;


public class Problema1244 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        char aux;
        String cadena=leer.nextLine().toLowerCase();
        while(cadena.equals("*")==false){
            int cont=1;
            String cad[]=cadena.split(" ");
            cadena=leer.nextLine().toLowerCase();
            aux=cad[0].charAt(0);
            for (int i = 1; i < cad.length; i++) {
                if(aux==cad[i].charAt(0)){
                    cont++;
                }
            }
            if(cont==cad.length){
                System.out.println("Y");
            }
            else{
                System.out.println("N");
            }
        }
    }
}
