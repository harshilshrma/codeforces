import java.util.Scanner;

public class NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int luckyNumberCount = 0;

        while (n > 0) {
            long digit = n % 10;
            if (digit == 7 || digit == 4) {
                luckyNumberCount++;
            }
            n = n / 10;
        }

        if (luckyNumberCount == 4 || luckyNumberCount == 7) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }

        sc.close();
    }
}
