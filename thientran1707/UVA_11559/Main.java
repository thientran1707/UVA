import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N, B, H, W;

    // read input
    while (sc.hasNextInt()) {
      N = sc.nextInt();
      B = sc.nextInt();
      H = sc.nextInt();
      W = sc.nextInt();

      int minCost = -1;
      int price;
      int[] bedsAvail = new int[W];

      for (int i = 0; i < H; i++) {
        price = sc.nextInt();
        // read list of beds available
        for (int j = 0; j < W; j++) {
          bedsAvail[j] = sc.nextInt();
        }

        int cost = findMinCost(price, bedsAvail, B, N);
        if (minCost == -1 || (cost != -1 && cost < minCost)) {
          minCost = cost;
        }
      }

      if (minCost != -1) {
        System.out.println(minCost);
      } else {
        System.out.println("stay home");
      }
    }
  }
  
  // return -1 if minCost does not exist
  static int findMinCost(int price, int[] bedsAvail, int budget, int peopleNo) {
    int minCost = Integer.MAX_VALUE;

    for (int i = 0; i < bedsAvail.length; i++) {
      int cost = peopleNo * price;
      if (bedsAvail[i] >= peopleNo && cost <= budget) {
        if (cost < minCost) {
          minCost = cost; 
        }
      }
    }

    return (minCost > budget) ? -1 : minCost;
  }
  
}