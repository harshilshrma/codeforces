import java.util.Scanner;

public class PileShuffling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long ans = 0;
            
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                int d = sc.nextInt();
                
                if (b <= d) {
                    ans += Math.max(0, a - c);
                } else {
                    ans += a;
                    ans += Math.max(0, b - d);
                }
            }
            
            System.out.println(ans);
        }
        
        sc.close();
    }
}