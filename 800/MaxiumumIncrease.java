import java.util.Scanner;

public class MaxiumumIncrease {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] inputLine = sc.nextLine().split(" ");

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(inputLine[i]);
        }

        int maxLen = 1, l = 0, r = 1, startIdx = 0;
        while (r < n) {
            if (arr[l] < arr[r]) {
                maxLen = Math.max(maxLen, r - startIdx + 1);
            } else {
                startIdx = r;
            }
            l++;
            r++;
        }

        System.out.println(maxLen);

        sc.close();
    }
}