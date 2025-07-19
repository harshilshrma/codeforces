import java.util.Arrays;
import java.util.Scanner;

public class OnlyOneDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < t; i++) {
            String num = sc.nextLine();
            char[] arr = num.toCharArray();
            Arrays.sort(arr);
            System.out.println(arr[0]);
        }

        sc.close();
    }
}
