import java.util.Arrays;
import java.util.Scanner;

public class DifficultContest {
    public static void solve(Scanner sc) {
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        
        System.out.println(new String(arr));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            solve(sc);
        }
    }
}
