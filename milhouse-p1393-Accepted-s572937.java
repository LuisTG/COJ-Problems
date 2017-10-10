
import java.math.BigInteger;
import java.util.Scanner;


public class Problema1393 {
    public static void main(String[] args) {
    Scanner leer=new Scanner(System.in);
    String num="",prin="";
    BigInteger n;
    int m,aux=0,fin=70;
    n=leer.nextBigInteger();
    m=leer.nextInt();
    num=""+n.pow(m);
    int j=num.length()/70;
    if(j>0){
        for (int i = 0; i < j; i++) {
            prin=num.substring(aux, fin);
            System.out.println(prin);
            aux+=70;
            fin+=70;
        }
        if((fin-70)<num.length()){
        prin=num.substring(fin-70);
        System.out.println(prin);
        }
    }
    else{
        System.out.println(num);
    }
}
}
