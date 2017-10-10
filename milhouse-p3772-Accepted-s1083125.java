import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luis
 */
public class TheRefund {
    public static void main(String[] args) throws IOException {
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        int casos=Integer.parseInt(leer.readLine().trim());
        while(casos-->0){
            int sum=0;
            String s[]=leer.readLine().trim().split(" ");
            for(String aux: s){
                sum+=Integer.parseInt(aux);
            }
            System.out.printf("%.3f\n",(sum*85.0)/100);
        }
    }
}
