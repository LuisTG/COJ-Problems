
import java.util.Scanner;


public class Problema1493 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String n=leer.next();
        double result,mayor,menor;
        if(n.equals("circle")==true){
        double radio=leer.nextDouble();
        result=(radio*radio)*3.14;
        }
        else{
        if (n.equals("rhombus")==true) {
            mayor=leer.nextDouble();
            menor=leer.nextDouble();
            result=mayor*menor/2;
        }
        else{
        mayor=leer.nextDouble();
            menor=leer.nextDouble();
            result=mayor*menor/2;
        }
        }
        result=Math.round((result/.01))*.01;
        add(result);
    }
    
    public static void add(double num){
        String n=""+num;
        String desp;
        int punto=n.indexOf(".");
        desp=n.substring(punto+1);
        if(desp.length()<2) n=n+"0";
        System.out.println(n);
    }
}
