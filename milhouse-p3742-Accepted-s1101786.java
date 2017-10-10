
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CatAlphabet {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while((line=br.readLine())!=null && line.length()>0){
            line = line.trim();
            int pal = 1;
            int caps = 0;
            for (int i = 0; i < line.length(); i++) {
                char tmp = line.charAt(i);
                if(Character.isUpperCase(tmp)){
                    caps++;
                }
                if(Character.isWhitespace(tmp)){
                    pal++;
                }
            }
            if(pal==caps) System.out.println("correct");
            else System.out.println("awful");
        }
        
    }
}
