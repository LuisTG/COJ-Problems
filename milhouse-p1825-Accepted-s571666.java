
import java.util.Scanner;


public class Problema1825 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int n=leer.nextInt();
        String pas="",nom,complet="";
        for (int i = 0; i < n; i++) {
            pas=leer.next();
            nom=leer.nextLine();
            String nombres[]=nom.split(" ");
            complet=pas.substring(0, 3);
            for (int j = 0; j <nombres.length; j++) {
                    complet=complet+nombres[j];
                    if(j<nombres.length-1&&j>0){
                    complet=complet+"*";
                    }
                }
            complet=complet+pas.substring(3);
            System.out.println(complet);
            complet="";
        }
        }
    }