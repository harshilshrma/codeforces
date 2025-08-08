import java.util.Scanner;

public class SubmissionIsAllYouNeed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            long ans = 0;
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                ans += Math.max(1, a);
            }
            System.out.println(ans);
        }
        sc.close();
    }
}