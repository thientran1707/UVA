import java.util.*;

class StringZip {

  static String encode(String string) {
    StringBuilder builder = new StringBuilder();
    int strLen = string.length();

    int count = 1;
    int start = 0;
    
    for (int i = 1; i < strLen; i++) {
      if (string.charAt(i) == string.charAt(start)) {
      	count++;
      } else {
      	// update res
        builder.append(string.charAt(start));
        if (count > 1) {
          builder.append(count);
        }
        // reset
        start = i;
        count = 1;
      }
    }

    return builder.toString();
  }

  static String decode(String string) {
    StringBuilder builder = new StringBuilder();
    int strLen = string.length();
    char start = string.charAt(0);
    builder.append(start);

    for (int i = 1; i < strLen; i++) {
      if (Character.isDigit(string.charAt(i))) {
      	int count = string.charAt(i) - '0';
      	for (int j =0; j < count - 1; j++) {
      	  builder.append(start);
      	}
      } else {
      	builder.append(string.charAt(i));
      }
    }

    return builder.toString();
  }

  public static void main(String[] args) {
    String input = "aaaazzzbbvjasdjfffsfss";
    System.out.println("Encode string: " + encode(input));
    System.out.println("Recover encode: " + decode(encode(input)));

  }
}