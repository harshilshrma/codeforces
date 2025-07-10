import java.util.Scanner;
public class CPlusEquals {

    // public static int[][] memo;
    
    // public static int solve(int a, int b, int n) {
    //     if (a > n || b > n) return 0;
    //     if (memo[a][b] != -1) return memo[a][b];

    //     int leftLen = solve(a + b, b, n) + 1;
    //     int rightLen = solve(a, b + a, n) + 1;

    //     memo[a][b] = Math.min(leftLen, rightLen);
    //     return memo[a][b];
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < t; i++) {
            String[] inputLine = sc.nextLine().split(" ");
            int a = Integer.parseInt(inputLine[0]);
            int b = Integer.parseInt(inputLine[1]);
            int n = Integer.parseInt(inputLine[2]);

            // memo = new int[n + 2][n + 2];
            // for (int[] arr : memo) Arrays.fill(arr, -1);
            // int ans = solve(a, b, n); 

            int steps = 0;
            while (a <= n && b <= n) {
                if (a < b) {
                    a += b;
                } else {
                    b += a;
                }
                steps++;
            }

            System.out.println(steps);
        }

        sc.close();
    }
}
    