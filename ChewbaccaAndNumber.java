import java.util.Scanner;

public class ChewbaccaAndNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            int inverted = 9 - digit;

            if (inverted < digit && !(i == 0 && inverted == 0)) {
                str.append(inverted);
            } else {
                str.append(digit);
            }
        }

        System.out.println(str.toString());
        sc.close();
    }

}

