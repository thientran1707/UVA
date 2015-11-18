import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) throws IOException {
    Reader.init(System.in);
    int T = Reader.nextInt();

    for (int i = 0; i < T; i++) {
      int N = Reader.nextInt();
      int[] C = new int[N];
      for (int j = 0; j < N; j++) {
        C[j] = Reader.nextInt();
      }

      System.out.println("Case " + (i + 1) + ": " + getMax(C));
    }
  }

  static int getMax(int[] array) {
    int max = array[0];
    for (int i = 1; i < array.length; i++) {
      if (array[i] > max) {
        max = array[i];
      }
    }

    return max;
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
}