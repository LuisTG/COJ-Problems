
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class p2642 {
    public static void main(String[] args) throws IOException {
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        int c=Integer.parseInt(leer.readLine());
        String x=leer.readLine().replace(" ", "1");
        String a[]=x.split("1");
        int sum[]=new int[a.length];
        int cont=0;
        for(int i=0;i<a.length;i+=2){
            for(int z=0;z<a[i].length();z++){
                switch(a[i].charAt(z)){
                    case '=':
				cont+=10;
				break;
			case '.':
				cont+=1;
				break;
			case ':':
				cont+=2;
				break;
			case '-':
				cont+=5;
				break;
                }
            }
            a[i]=""+cont;
            sum[i]=cont;
            cont=0;
        }
        cont=0;
            for(int s=1;s<a.length;s+=2){
                if(a[s].equals("*")){
                    sum[s+1]=sum[s-1]*sum[s+1];
                    sum[s-1]=0;
                }
            }
            for(int s=0;s<a.length;s++){
                cont+=sum[s];
            }
            System.out.println(cont);
        }
    }
