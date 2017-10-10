
import java.text.DecimalFormat;
import java.util.Scanner;

public class Problema1603 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0000000000");
        long num = leer.nextLong();
        long num2 = leer.nextLong();
        String aux1, aux2;
        int aux3, aux4,res=0,result;
        while (num != 0 || num2 != 0) {
            int cont=0;
            aux1 = df.format(num);
            aux2 = df.format(num2);
            for (int i = 9; i >=0; i--) {
                aux3 = Integer.parseInt("" + aux1.charAt(i));
                aux4 = Integer.parseInt("" + aux2.charAt(i));
                result=aux3+aux4+res;
                if(result>9){
                    cont++;
                    res=1;
                }
                else{
                    res=0;
                }
            }
            if (cont == 0) {
                System.out.println("No carry operation.");
            } else if (cont == 1) {
                System.out.println("1 carry operation.");
            } else {
                System.out.println(cont + " carry operations.");
            }
            num = leer.nextLong();
            num2 = leer.nextLong();
            res=0;
        }
    }
}
