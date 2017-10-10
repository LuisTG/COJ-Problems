import java.util.Scanner;

public class CryptographersConundrum {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String s=leer.next();
        s=s.toUpperCase();
        int cont=0;
        for (int i = 0; i < s.length(); i++) {
            switch(i%3){
                case 0:
                    if(s.charAt(i)!='P')
                        cont++;
                    break;
                case 1:
                    if(s.charAt(i)!='E')
                        cont++;
                    break;
                case 2:
                    if(s.charAt(i)!='R')
                        cont++;
                    break;
                    
            }
        }
        System.out.println(cont);
    }
}
