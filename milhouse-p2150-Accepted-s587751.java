
import java.util.Scanner;


public class P2150 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
       int casos=leer.nextInt();
        for (int i = 0; i < casos; i++) {
            int cant[]={0,0,0,0};
            String palabra=leer.next();
            char pal[]=palabra.toCharArray();
            int largo=pal.length;
            for (int j = 0; j < largo/2; j++) {
                if(pal[j]>96&&pal[j]<123) cant[0]++;
                else cant[1]++;
            }
            if(largo%2!=0) largo=largo+2;
            for (int j = largo/2; j < pal.length; j++) {
                if(pal[j]>96&&pal[j]<123) cant[2]++;
                else cant[3]++;
            }
            if(cant[0]==cant[2]&&cant[1]==cant[3]) System.out.println("SI");
            else System.out.println("NO");
        }
    }
}
