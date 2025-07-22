import java.util.Scanner;

public class LeftAndDown {

    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void solve(Scanner sc) {
        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();

        int ops = 0;
        long gcd = gcd(a, b);
        
        long reducedA = a / gcd;
        long reducedB = b / gcd;

        if (Math.max(reducedA, reducedB) <= k) {
            ops = 1;
        } else {
            ops = 2;
        }

        System.out.println(ops);
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
