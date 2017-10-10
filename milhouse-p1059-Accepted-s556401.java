
import java.math.BigInteger;
import java.util.Scanner;


public class Problema1059 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        BigInteger num=leer.nextBigInteger();
        BigInteger cer=new BigInteger("0");
        String conv="";
        int largo,cont=0;
        char caracter;
        while (num.compareTo(cer)!=0){
        conv=num.toString(2);
            largo=conv.length();
            for(int i=0;i<largo;i++){
            caracter=conv.charAt(i);
            if(caracter=='1'){
            cont++;
            }
            }
            System.out.println("The parity of "+conv+" is "+cont+" (mod 2).");
            num=leer.nextBigInteger();
            cont=0;
        }
    }
}
