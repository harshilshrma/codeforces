import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String ans = input.substring(0, 1).toUpperCase() + input.substring(1);

        System.out.println(ans);
        sc.close();
    }
}
