import java.io.*;



public class Problema_3106 {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1,s2,s3;
        
        s3 = br.readLine();
        String arr[] = s3.split("\\s");
        s1 = arr[0];
        s2 = arr[1];
        s3=s1+s2;
        System.out.println(Pal(s3,0,s3.length()-1)?"Yes":"No");
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
