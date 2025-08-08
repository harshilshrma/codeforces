import java.util.ArrayList;
import java.util.Scanner;

public class Trash {
    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        long c = sc.nextLong();

        ArrayList<Long> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextLong());
        }

        int coins = 0;
        
        while (!arr.isEmpty()) {
            // Find the best bag to remove (largest that's <= c, or any if all > c)
            int bestIndex = 0;
            long bestValue = -1;
            
            // First try to find largest bag <= c
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i) <= c && arr.get(i) > bestValue) {
                    bestValue = arr.get(i);
                    bestIndex = i;
                }
            }
            
            // If no bag <= c, just remove the first one
            if (bestValue == -1) {
                bestIndex = 0;
                coins++;
            }
            
            System.out.println("best value: " + bestValue + " " + "best index: " + bestIndex + " " + "coins: " + coins);
            
            // Remove the chosen bag
            arr.remove(bestIndex);
            
            // Double all remaining bags
            int allBad = 0;

            for (int i = 0; i < arr.size(); i++) {
                arr.set(i, arr.get(i) * 2);
                if (arr.get(i) > c) {
                    allBad++;
                }
            }

            if (allBad == arr.size()) {
                coins += arr.size();
                break;
            }
            
            System.out.println(arr);
            System.out.println(" - - - - - - ");
        }

        System.out.println(coins);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
        sc.close();
    }
}
