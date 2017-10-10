
import java.util.Scanner;

 class pruebita1612 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String n=leer.nextLine();
        while(n.equals("#")!=true){
            n=n.replace("%", "%25");
            n=n.replace(" ", "%20");
            n=n.replace("!", "%21");
            n=n.replace("$", "%24");
            n=n.replace("(", "%28");
            n=n.replace(")", "%29");
            n=n.replace("*", "%2a");
            System.out.println(n);
            n=leer.nextLine();
        }
        }    
    }
