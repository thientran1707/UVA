import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) throws IOException {
    // read input
    Scanner sc = new Scanner(System.in);
    String input = new String();

    while (sc.hasNextLine()) {
      input = sc.nextLine();
      System.out.println(toTEX(input));
    }
  }

  static String toTEX(String str) {
    StringBuilder res = new StringBuilder();
    boolean open = true;
    int strLen = str.length();

    for (int i = 0; i < strLen; i++) {
      if (str.charAt(i) == '\"') {
        if (open) {
          res.append("``");
        } else {
          res.append("''");
        }

        // reverse open
        open = !open;
      } else {
        res.append(str.charAt(i));
      }
    }

    return res.toString();
  }
}