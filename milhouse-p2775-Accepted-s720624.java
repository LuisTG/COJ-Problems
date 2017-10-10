import java.util.Scanner;

public class P2775 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int casos=leer.nextInt();

        for (int i = 0; i < casos; i++) {
            String x=leer.next();
            char aux=x.charAt(0);
            switch(aux){
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
                                System.out.println(x+"cow");
			break;
			default:
				x=x.substring(1, x.length());
				x=x+aux+"";
				System.out.println(x+"ow");
				break;
            }
        }
    }
}
