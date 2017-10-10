
import java.util.Scanner;


public class Problema1566 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int num,acum=0;
        num=leer.nextInt();
        while(num!=0){
        for(int i=1;i<=num;i++){
        acum=acum+(i*i);
        }
            System.out.println(acum);
        acum=0;
        num=leer.nextInt();
        }
    }
}
