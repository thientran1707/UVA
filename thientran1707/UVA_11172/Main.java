import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) throws IOException {
    Reader.init(System.in);
    int numOfLines = Reader.nextInt();
    
    for (int i = 0; i < numOfLines; i++) {
      int first = Reader.nextInt();
      int second = Reader.nextInt();
      if (first > second) {
        System.out.println(">");
      } else if (first < second) {
        System.out.println("<");
      } else {
        System.out.println("=");
      }
    }
  }
}

/** Class for buffered reading int and double values */
class Reader {
    static BufferedReader reader;
    static StringTokenizer tokenizer;

    /** call this method to initialize reader for InputStream */
    static void init(InputStream input) {
        reader = new BufferedReader(new InputStreamReader(input));
        tokenizer = new StringTokenizer("");
    }

    /** get next word */
    static String next() throws IOException {
        while (!tokenizer.hasMoreTokens()) {
            //TODO add check for eof if necessary
            tokenizer = new StringTokenizer(reader.readLine());
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }
  
    static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }
}