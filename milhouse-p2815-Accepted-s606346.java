import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
       StringBuilder st=new StringBuilder();
       int casos=leer.nextInt();
       String t,p;
       while(casos>0){
           int cont=0,var=0;
           t=leer.next();
           p=leer.next();
           String aux;
           st.append(t);
           int largo=st.length();
               if(t.contains(p)==true) var=1;
               else var=0;
               while(var==1){
                   st.delete(st.indexOf(p), st.indexOf(p)+p.length());
                   t=st.toString();
                   if(t.contains(p)==true) var=1;
                   else
                       var=0;
                   cont++;
                   }
           System.out.println(cont);
           st.delete(0, st.length());
       casos--;
       }
       }
       
    }