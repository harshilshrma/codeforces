import java.util.Scanner;

public class BoringApartments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < t; i++) { 
            String x = sc.nextLine();
            int digits = 0;
            
            int firstDigit = x.charAt(0) - '0';
            for (int j = 0; j < firstDigit - 1; j++) {
                digits += 10;
            }

            int numberOfDigits = x.length();
            digits += numberOfDigits * (numberOfDigits + 1) / 2;

            System.out.println(digits);
        }

        sc.close();
    }
}