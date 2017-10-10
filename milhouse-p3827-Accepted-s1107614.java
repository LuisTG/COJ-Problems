import java.util.Scanner;

public class TUna {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int n=leer.nextInt();
        int x=leer.nextInt();
        int a,b;
        int cont=0;
        for (int i = 0; i < n; i++) {
            a=leer.nextInt();
            b=leer.nextInt();
            if(Math.abs(a-b)>x){
                cont+=leer.nextInt();
            }else{
                cont+=Math.max(a, b);
            }
        }
        System.out.println(cont);
    }
}
