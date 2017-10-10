import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class P2183 {
    public static void main(String[] args)throws IOException {
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(leer.readLine());
    String letras;
        for (int i = 0; i < n; i++) {
            int num,cont=0,men=0;
            letras=leer.readLine();
            for (int j = 0; j < letras.length(); j++) {
                num=(int) letras.charAt(j);
                if (num%2==0) {
                    cont++;
                }
                else{
                men++;
                }
            }
            if(cont>men){
                System.out.println("Even");
            }
            else{
                System.out.println("Odd");
            }
        }
    }
}