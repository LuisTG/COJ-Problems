
import java.util.Scanner;


public class Problema2105 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int n=leer.nextInt();
        int m=leer.nextInt();
        int aux=0,acum=0;
        char map[][]=new char[n][m];
        for (int i = 0; i <= n-1; i++) {
            map[i]=leer.next().toCharArray();
        }
        for (int i = 1; i < n-1; i++) {
            for (int j = 1; j < m-1; j++) {
            if(map[i][j]=='+'){
                    if(map[i][j]=='+'&&map[i-1][j]=='-'||map[i][j]=='+'&&map[i][j-1]=='-'||map[i][j]=='+'&&map[i][j+1]=='-'||map[i][j]=='+'&&map[i+1][j]=='-'||map[i][j]=='+'&&map[i-1][j]=='-'){
                    acum++;

                }
            }
           }
        }
        System.out.println(acum);
    }
}
