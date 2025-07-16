
import java.util.Scanner;

public class ErasingZeroes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < t; i++) {
            String s = sc.nextLine();

            if (s.length() == 1 || s.length() == 2) {
                System.out.println("0");
                continue;
            }

            int ans = 0;
            int firstOne = s.indexOf('1');
            int lastOne = s.lastIndexOf('1');
            // System.out.println("firstone " + firstOne + " lastone " + lastOne);

            for (int j = firstOne + 1; j < lastOne; j++) {
                if (s.charAt(j) == '0') {
                    ans++;
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
