import java.util.Scanner;
public class AssigningToClasses {
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int half = sc.nextInt();
        int[] arr = new int[2 * half];

        for (int i = 0; i < 2 * half; i++) {
            arr[i] = sc.nextInt();
        }


        System.out.println();
        sc.close();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }

        sc.close();
    }
}
