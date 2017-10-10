
import java.util.Scanner;


public class Problema1625 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String meses[]={"0","0","0","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER","JANUARY","FEBRUARY"};
        String dias[]={"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
        int casos=leer.nextInt();
        for(int j=0;j<casos;j++){
        int anio=leer.nextInt();
        String mes=leer.next();
        int q,m=0,largo,J,k,result;
        q=leer.nextInt();
            for (int i = 0; i < meses.length; i++) {
                if (mes.equals(meses[i])) {
                    m=i;
                }
            }
            J=anio/100;
            k=anio%100;
            result=(q+((m+1)*26)/10)+k+(k/4)+5-J;
            result=result%7;
            result=Math.abs(result);
            System.out.println(dias[result]);
            }
        }
        }
