
import java.util.Scanner;

 class p1612 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        while(leer.hasNext()){
            String a=leer.next();
            String b=leer.next();
            int cont=0;
            for (int i = 0,x=0; i < b.length(); i++) {
                if(a.charAt(x)==b.charAt(i)){
                    cont++;
                    x++;
                }
                if(x==a.length()){
                    break;
                }
            }
            	if(cont==a.length()){
			                 System.out.println("Yes");
		}else{
			                 System.out.println("No");
		}
        }
        }    
    }
