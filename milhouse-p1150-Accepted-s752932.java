

import java.util.Scanner;


public class Problema1150 {

    public static void main(String[] args) {
        String n;
        Scanner leer=new Scanner(System.in);
        for (int i = 0; i < 1000; i++) {
            n="";
            n=leer.next();
            n=n.charAt(n.length()-1)+"";
            if(n.equals("0")==false){
            System.out.println("1");
            System.out.println(n);}
            else{
                System.out.println("2");
            }
        }
    }
}