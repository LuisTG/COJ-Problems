
import java.util.Scanner;


public class Problema1049 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int num=leer.nextInt();
        int result;
        if(num>=0){
        result=(num*(num+1))/2;
        }
        else{
        result=((num*(-num+1))/2)+1;
        }
        System.out.println(result);
    }
}
