import java.util.Scanner;

public class MaxiumumIncrease {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int maxLen = 1, currLen = 1;
        int prev = sc.nextInt();

        for (int i = 1; i < n; i++) {
            int curr = sc.nextInt();
            if (curr > prev) {
                currLen++;
                maxLen = Math.max(maxLen, currLen);
            } else {
                currLen = 1;
            }
            prev = curr;
        }

        System.out.println(maxLen);

        sc.close();
    }
}