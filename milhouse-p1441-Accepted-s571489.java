
import java.util.Scanner;


public class Problema1441 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int nums[]=new int[3];
        int aux;
        nums[0]=(int)Math.pow(leer.nextInt(), 2);
        nums[1]=(int)Math.pow(leer.nextInt(), 2);
        nums[2]=(int)Math.pow(leer.nextInt(), 2);
        int result=nums[0]+nums[1]+nums[2];
        while(result!=0){
            for (int i = 0; i < 2; i++) {
                for (int j = i+1; j < 3; j++) {
                    if (nums[i]>nums[j]) {
                        aux=nums[j];
                        nums[j]=nums[i];
                        nums[i]=aux;
                    }
                }
            }
             if(nums[0]+nums[1]==nums[2]){
                 System.out.println("right");
             }
             else{
                 System.out.println("wrong");
             }
            nums[0]=(int)Math.pow(leer.nextInt(), 2);
        nums[1]=(int)Math.pow(leer.nextInt(), 2);
        nums[2]=(int)Math.pow(leer.nextInt(), 2);
         result=nums[0]+nums[1]+nums[2];
         }
    }
}
