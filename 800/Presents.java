import java.util.Scanner;

public class Presents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] line = sc.nextLine().split(" ");
        
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int giftGiver = Integer.parseInt(line[i]);
            ans[giftGiver - 1] = i + 1;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }

        sc.close();
    }
}