import java.util.Scanner;

public class Problema2147 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String letras;
        int num,largo,residuo;
        int casos;
        casos=leer.nextInt();
        
        for (int i = 0; i < casos; i++) {
                    letras=leer.next();
                    num=leer.nextInt();
            String ord[]=new String[letras.length()];
            largo=letras.length();
            for (int j = 0; j < largo; j++) {
                residuo=0;
                if(j+num<largo){
                    ord[j+num]=letras.charAt(j)+"";
                }else{                                                                    
                    residuo=num%largo;
                    if(j+residuo<largo){
                        ord[j+residuo]=letras.charAt(j)+"";
                    }
                    else{
                        residuo=j+residuo-largo;
                        ord[residuo]=letras.charAt(j)+"";
                    }
                }
            }
            letras="";
            for (int j = 0; j < largo; j++) {
                letras=letras+ord[j];
            }
            System.out.println(letras);
        }
    }
}
