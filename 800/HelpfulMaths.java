
import java.util.Scanner;

public class HelpfulMaths {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("\\+");
        int ones = 0, twos = 0, threes = 0;
        for (String s : input) {
            if (s.equals("1")) {
                ones++; 
            } else if (s.equals("2")) {
                twos++; 
            } else if (s.equals("3")) {
                threes++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ones; i++) {
            sb.append("1+");
        }
        for (int i = 0; i < twos; i++) {
            sb.append("2+");
        }
        for (int i = 0; i < threes; i++) {
            sb.append("3+");
        }
        System.out.println(sb.substring(0, sb.length() - 1));

        sc.close();
    }
}
