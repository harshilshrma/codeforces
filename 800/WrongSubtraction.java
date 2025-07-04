import java.util.Scanner;
public class WrongSubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputLine = sc.nextLine().split(" ");
        int n = Integer.parseInt(inputLine[0]);
        int numberOfSubtractions = Integer.parseInt(inputLine[1]);
        
        while (numberOfSubtractions > 0) {
            int lastDigit = n % 10;
            if (lastDigit == 0) {
                n = n / 10;
            } else {
                n--;
            }

            numberOfSubtractions--;
        }

        System.out.println(n);
        sc.close();
    }
}
