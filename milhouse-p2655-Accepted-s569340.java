
import java.util.Scanner;


public class Problema2655 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String num[]=new String[5];
        String aux="";
        for (int i = 0; i < 5; i++) {
            num[i]=leer.next();
        }
        for (int i = 0; i < 5; i++) {
            if(num[i].contains("FBI")==true){
            aux=aux+(i+1);
            aux=aux+" ";
            }
            
        }
        if(aux.equals("")==true){
            System.out.println("HE GOT AWAY!");
        }
        else{
        System.out.println(aux.substring(0, aux.length()-1));
        }
    }
}
