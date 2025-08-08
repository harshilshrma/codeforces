import java.util.Scanner;

public class CountGoodNumbers {
    
    public static long countGood(long n) {
        return n
            - n / 2 - n / 3 - n / 5 - n / 7
            + n / 6 + n / 10 + n / 14 + n / 15 + n / 21 + n / 35
            - n / 30 - n / 42 - n / 70 - n / 105
            + n / 210;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long l = sc.nextLong();
            long r = sc.nextLong();
            System.out.println(countGood(r) - countGood(l - 1));
        }
        sc.close();
    }
}
