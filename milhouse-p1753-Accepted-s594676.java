
import java.util.Scanner;


public class P1753 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String letras[]={"","","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
        StringBuilder rever=new StringBuilder();
        int n=leer.nextInt();
        String aux="";
        for (int i = 0; i < n; i++) {
            String cadena=leer.next().toUpperCase();
            for (int j = 0; j < cadena.length(); j++) {
                for (int k = 2; k < letras.length; k++) {
                    if (letras[k].contains(cadena.charAt(j)+"")) {
                       aux=aux+k; 
                    }
                }
            }
            rever.append(aux);
            rever.reverse();
            if (aux.equals(rever.toString())) {
                System.out.println("YES");
            }
            else
                System.out.println("NO");
            rever.delete(0, rever.length());
            aux="";
        }
    }
}
