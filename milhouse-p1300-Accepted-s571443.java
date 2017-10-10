
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luis
 */
public class Problema1300 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int nums[]=new int[10];
        int cont=0,elim=-1,result=10;
        for (int i = 0; i < 10; i++) {
           nums[i]=leer.nextInt()%42;
        }
        for (int i = 0; i < 10; i++) {
            for (int j = i+1; j < 10; j++) {
                if(nums[i]==nums[j]){
                cont++;
                nums[j]=elim;
                elim--;
                }
                result=result-cont;
                cont=0;
            }
        }
        System.out.println(result);
    }
}
