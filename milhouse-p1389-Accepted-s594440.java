
import java.util.Scanner;

public class P1389 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        StringBuilder revers=new StringBuilder();
        String num=leer.next();
        String aux,mayor="";
        int largo=num.length();
        for (int i = 0; i < largo+1; i++) {
            for (int j = i+1; j < largo+1; j++) {
                revers.append(num.substring(i, j));
                revers.reverse();
                aux=revers.toString();
                revers.delete(0, revers.length());
                if(num.substring(i, j).equals(aux)==true)
                    if(mayor.length()<aux.length())
                        mayor=aux;
            }
        }
        System.out.println(mayor);
    }
}
