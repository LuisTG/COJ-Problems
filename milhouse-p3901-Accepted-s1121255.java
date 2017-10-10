import java.util.HashMap;
import java.util.Scanner;

public class KUESKI {
    
    static class point{
        int x,y;

        public point(int x, int y) {
            this.x = x;
            this.y = y;
        }
        
    }
    
    static double dist(point a, point b){
        return Math.hypot(a.x-b.x, a.y-b.y);
    }
    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        double w,h;
        point a=new point(leer.nextInt(),leer.nextInt());
        point b=new point(leer.nextInt(),leer.nextInt());
        point c=new point(leer.nextInt(),leer.nextInt());
        point d=new point(leer.nextInt(),leer.nextInt());
        
        point x=new point(b.x,a.y);
        point y=new point(a.x,c.y);
        double ancho1= dist(a,x);
        double alto1=dist(a,y);
        //System.out.println(alto1+" "+ancho1);
    point z=new point(d.x,c.y);
        point zz=new point(b.x,c.y);
        double ancho2=dist(z,zz);
        double alto2=dist(x,b);
        //System.out.println(alto2+" "+ancho2);

        point xx=new point(a.x,b.y);
        point yy=new point(d.x,b.y);
        double ancho3=dist(b,xx);
        double alto3=dist(yy,d);
        
        point zzz=new point(a.x,c.y);
        double ancho4=dist(zzz,c);
        double alto4=dist(xx,a);
            
        w=leer.nextDouble();
        h=leer.nextDouble();
        
        if((w<=ancho1 && h<=alto1) || (w<=ancho2 && h<=alto2) || (w<=ancho3 && h<=alto3) || (w<=ancho4 && h<=alto4)){
        System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}
