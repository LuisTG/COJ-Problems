
import java.util.Scanner;


public class Problema1679 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        double pa,pj,g,a,ta,tr;
        int j=0;
        double result[]=new double[2];
        String nombre[]=new String[2];
        int n=leer.nextInt();
        for (int i = 0; i < n; i++) {
            nombre[j]=leer.next();
            pa=leer.nextDouble();
            pj=leer.nextDouble();
            g=leer.nextDouble();
            a=leer.nextDouble();
            ta=leer.nextDouble();
            tr=leer.nextDouble();
            result[j]=Math.log10(pa)+pj+(2*g)+a-(ta+2*tr);
            if(i==0){
            j++;
            }
            if(i>0){
            if(result[0]<result[1]){
                result[0]=result[1];
                nombre[0]=nombre[1];
            }
            }
        }   
        System.out.println(nombre[0]);
    }
}
