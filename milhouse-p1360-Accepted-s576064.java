
import java.util.Scanner;


public class Problema1360 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int a=leer.nextInt();
        int b=leer.nextInt();
        int result,rest,aux,aux2;
        while(a!=0&&b!=0){
        String con="";
        result=a/b;
        rest=a-(result*b);
        aux=b;
        while(rest>0){
        con=con+result+",";
        aux2=aux;
        result=aux/rest;
        aux=rest;
        rest=aux2-(result*aux);
        }
        con=con+result;
        String cadena[]=con.split(",");
        aux=Integer.parseInt(cadena[cadena.length-1]);
        aux=aux-1;
        cadena[cadena.length-1]=""+aux;
        con="";
        for (int i = 0; i < cadena.length; i++) {
            con=con+cadena[i]+",";
        }
        con=con+1;
        System.out.printf("%d/%d=[%s]\n",a,b,con);
        con="";
        a=leer.nextInt();
        b=leer.nextInt();
    }
    }
}
