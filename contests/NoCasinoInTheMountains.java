import java.util.Scanner;

public class NoCasinoInTheMountains {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        for (int test = 0; test < t; test++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int ans = 0;
            int i = 0;
            while (i <= n - k) {
                boolean canHike = true;
                for (int j = 0; j < k; j++) {
                    if (a[i + j] != 0) {
                        canHike = false;
                        break;
                    }
                }
                if (canHike) {
                    ans++;
                    i += k + 1;
                } else {
                    i++;
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
