

import java.util.Scanner;


public class MayorPalindromoDentroString {

 
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String n=leer.next();
        String p=leer.next();
        n=n+p;
        int cant=nombre(0,n.length()-1,n);
        if(cant==n.length()) System.out.println("Yes");
        else System.out.println("No");
    }
    
    static int nombre(int l, int r, String n){
    if(l==r) return +1;
    if(l+1==r){
        if(n.charAt(l)==n.charAt(r)) return +2;
        else return +1;
    }
    if(n.charAt(l)==n.charAt(r)) return +2+nombre(l+1,r-1,n);
    else{
        return Math.max(nombre(l,r-1,n), nombre(l+1,r,n));
    }
    }
    
}
