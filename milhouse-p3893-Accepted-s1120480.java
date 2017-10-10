import java.util.Scanner;
import java.util.Arrays;

public class EnumerationRationalNumber {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        long EulerPhi[] = new long[200001];
        for (int i = 1; i <= 200000; i++) {
            EulerPhi[i] = i;
        }
        EulerPhi[1]=2;
        for (int i = 2; i <= 200000; i++) {
            if (EulerPhi[i] == i)
            {
                for (int j = i; j <= 200000; j += i) {
                    EulerPhi[j] = (EulerPhi[j] / i) * (i - 1);
                }
            }
            EulerPhi[i]+=EulerPhi[i-1];
           // System.out.println(i+" "+EulerPhi[i]);
        }
        long a;
        //System.out.println("hola");
        a=leer.nextLong();
        //while(a!=0){
            if(a==1) System.out.println("0/1");
            else
                if(a==2) System.out.println("1/1");
                else{
           int x= Arrays.binarySearch(EulerPhi, a);
           if(x<0){
               x=(x*-1)-2;
               long resp=a-EulerPhi[x];
               x++;
                int cont=0;
               for (int i = 1; i < x; i++) {
                   if(gcd(i,x)==1){
                       cont++;
                   }
                   if(cont==resp){
                       System.out.println(i+"/"+x);
                       break;
                   }
               }
           }else{
               for(int i=x-1;i>=1;i--){
                   if(gcd(x,i)==1){
                       System.out.println(i+"/"+x);
                       break;
                   }
               }
           }
                }
          // a=leer.nextLong();
        //}
    }
    
    static int gcd(int a, int b) { return b == 0 ? a : gcd(b, a % b); }
}
