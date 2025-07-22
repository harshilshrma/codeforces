import java.util.Arrays;
import java.util.Scanner;
public class AssigningToClasses {
    public static void solve(Scanner sc) {
        int half = sc.nextInt();
        int[] arr = new int[2 * half];

        // input arr
        for (int i = 0; i < 2 * half; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int ans = Math.abs(arr[half] - arr[half - 1]);
        System.out.println(ans);
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
