import java.util.HashSet;
import java.util.Scanner;
public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        HashSet<Character> set = new HashSet<>();
        int uniqueCharCount = 0;

        for (char c : name.toCharArray()) {
            if (!set.contains(c)) {
                set.add(c);
                uniqueCharCount++;
            }
        }

        if (uniqueCharCount % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }

        sc.close();
    }    
}
