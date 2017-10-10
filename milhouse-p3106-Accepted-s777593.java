import java.util.Scanner;



public class Problema_3106 {
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
       String a,b;
       a=leer.next();
       b=leer.next();
       a+=b;
        System.out.println(Pal(a,0,a.length()-1)?"Yes":"No");
    }
    
    static boolean Pal(String n, int i, int j) {
        if (i >= j) {
            return true;
        } else {
            if (n.charAt(i) != n.charAt(j)) {
                return false;
            } else {
                return Pal(n, ++i, --j);
            }
}
    }
}
