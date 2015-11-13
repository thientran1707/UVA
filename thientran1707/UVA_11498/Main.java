import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) throws IOException {
    Reader.init(System.in);
    int numQueries, x_division, y_division;

    while ((numQueries = Reader.nextInt()) != 0) {
      // take division point
      x_division = Reader.nextInt();
      y_division = Reader.nextInt();

      for (int i = 0; i < numQueries; i++) {
        System.out.println(getRegion(x_division, y_division, Reader.nextInt(), Reader.nextInt()));
      }
    }
  }

  static String getRegion(int x_division, int y_division, int x_point, int y_point) {
    if (x_point == x_division || y_point == y_division) {
      return "divisa";
    } else if (x_point < x_division && y_point > y_division) {
      return "NO";
    } else if (x_point > x_division && y_point > y_division) {
      return "NE";
    } else if (x_point < x_division && y_point < y_division) {
      return "SO";
    } else {
      return "SE";
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

  static String nextLine() throws IOException {
    return reader.readLine();
  }
}