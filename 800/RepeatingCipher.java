import java.util.Scanner;

public class RepeatingCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String s = sc.nextLine();
        StringBuilder str = new StringBuilder();
        int ptr = 0, idx = 1;
        while (ptr < s.length()) {
            str.append(s.charAt(ptr));
            ptr += idx;
            idx++;
        }
        System.out.println(str.toString());


        sc.close();
    }
}