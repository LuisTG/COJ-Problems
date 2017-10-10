
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class mierda {
    public static void main(String[] args)throws IOException {
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        int cont=Integer.parseInt(leer.readLine());
        for (int i = 0; i < cont; i++) {
            String aux2=leer.readLine();
            String a[]=aux2.split(" ");
            String aux="";
            for(int j=0,x=a.length-1;j<a.length;j++){
                if (a.length==2) {
                    aux=a[j].substring(0, 2)+a[x]+a[j].substring(2,4);
                    break;
                }
                else{
                if(j==0){
            aux=aux+a[j].substring(0, 2)+a[x];
            j++;
            x--;
            }
            else{
                if(j<a.length-1){
                    aux=aux+"*"+a[x];
                    x--;
                }
                else{
                    aux=aux+"*"+a[1]+a[0].substring(2,4);
                    j++;
                }
            }
            }
            }
            System.out.println(aux);
        }
    }
}
