import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author luis
 */
public class PhoneList {

    static class Trie {

         TrieNode root;

        public Trie() {
            root = new TrieNode();
        }
        
        /*public int getCont(){
            return root.cont;
        }*/

        /**
         * agregar palabras al trie
         */
        public void addWord(String word) {
            root.addWord(word.toLowerCase());
        }

        /**
         * obtener el las palabras en el trie con el prefijo dado
         */
        public List getWords(String prefix) {

            TrieNode lastNode = root;
            for (int i = 0; i < prefix.length(); i++) {
                lastNode = lastNode.getNode(prefix.charAt(i));

                // si nada coincide
                if (lastNode == null) {
                    return new ArrayList();
                }


            }
            return lastNode.getWords();
        }
    }

    static class TrieNode {

        private TrieNode padre;
        private TrieNode[] hijo;
        private boolean hayHijo;
        private boolean hayPalabra;
        private char character;
        //private int cont;

        public TrieNode() {
            hijo = new TrieNode[26];
            hayHijo = true;
            hayPalabra = false;
        }

        public TrieNode(char caracter) {
            this();
            this.character = caracter;
        }

        protected void addWord(String word) {
            hayHijo = false;
            int charPos = word.charAt(0) - '0';
            if (hijo[charPos] == null) {
                hijo[charPos] = new TrieNode(word.charAt(0));
                hijo[charPos].padre = this;
            }

            if (word.length() > 1) {
                hijo[charPos].addWord((word.substring(1)));
            } else {
                hijo[charPos].hayPalabra = true;
            }
        }

        protected TrieNode getNode(char c) {
            return hijo[c - '0'];

        }

        protected List getWords() {
            List list = new ArrayList();

            if (hayPalabra) {
               list.add(toString()); //System.out.println());
            }

            if (!hayHijo) {
                for (int i = 0; i < hijo.length; i++) {
                    if (hijo[i] != null) {
                        list.addAll(hijo[i].getWords());
                    }

                }
            }
            return list;
        }

        @Override
        public String toString() {
            if (padre == null) {
                return "";
            } else {
                return padre.toString() + new String(new char[]{character});
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int casos=leer.nextInt();
        int datos;
        for (int i = 0; i < casos; i++) {
            Trie t=new Trie();
            datos=leer.nextInt();
           String s[]=new String[datos]; 
            for (int j = 0; j < datos; j++) {
                s[j]=leer.next();
                t.addWord(s[j]);
            }
            String n="YES";
            for (int j = 0; j < datos; j++) {
                if(t.getWords(s[j]).size()>1) {n="NO"; break;}
            }
            System.out.println(n);
       }
    }
}
