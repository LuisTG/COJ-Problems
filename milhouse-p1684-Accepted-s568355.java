
import java.util.Scanner;


public class Problema1684 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String bi,result="",con[]={"I","V","X","L","C","D","M"};
        int numero,res,aux;
        int casos=leer.nextInt();
        for (int h = 0; h < casos; h++) {
            bi=leer.next();
        numero=Integer.parseInt(bi, 2);
        switch(1){
            case 1: 
                res=numero/1000;
                for (int i = 0; i < res; i++) {
            result=result+con[6];
        }
                numero=numero-(res*1000);
            case 2:
                       res=numero/100;
                       if(res==9){
                       result=result+"CM";
                       }
                       else{
                       if(res>=5){
                       result=result+"D";
                       aux=res-5;
                           for (int i = 0; i < aux; i++) {
                               result=result+"C";
                           }
                       }
                       else
                           if(res==4){
                           result=result+"CD";
                           }
                           else{
                              for (int i = 0; i < res; i++) {
                               result=result+"C";
                           } 
                           }
                       }
                numero=numero-(res*100);
            case 3:
                       res=numero/10;
                       if(res==9){
                       result=result+"XC";
                       }
                       else{
                       if(res>=5){
                       result=result+"L";
                       aux=res-5;
                           for (int i = 0; i < aux; i++) {
                               result=result+"X";
                           }
                       }
                       else
                           if(res==4){
                           result=result+"XL";
                           }
                           else{
                              for (int i = 0; i < res; i++) {
                               result=result+"X";
                           } 
                           }
                       }
                numero=numero-(res*10);
            case 4:
                       res=numero/1;
                       if(res==9){
                       result=result+"IX";
                       }
                       else{
                       if(res>=5){
                       result=result+"V";
                       aux=res-5;
                           for (int i = 0; i < aux; i++) {
                               result=result+"I";
                           }
                       }
                       else
                           if(res==4){
                           result=result+"IV";
                           }
                           else{
                              for (int i = 0; i < res; i++) {
                               result=result+"I";
                           } 
                           }
                       }
                
                       }
        System.out.println(result);
        result="";
        }
    }
    }
