import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) throws IOException {
    Reader.init(System.in);
    int numLines = Reader.nextInt();

    for (int i = 0; i < numLines; i++) {
      System.out.println("Case " + (i + 1) + ": " +
        findSurvivor(
          Reader.nextInt(), Reader.nextInt(), Reader.nextInt()
        )
      );
    }
  }

  static int findSurvivor(int first, int second, int third) {
    int[] list = {first, second, third};
    Arrays.sort(list);
    return list[1];
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

  static String nextLine() throws IOException {
    return reader.readLine();
  }
}