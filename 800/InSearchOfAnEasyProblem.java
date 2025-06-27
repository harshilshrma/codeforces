import java.util.Scanner;

public class InSearchOfAnEasyProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isHard = false;
        sc.nextLine();
        String[] line = sc.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            if (Integer.parseInt(line[i]) == 1) {
                System.out.print("HARD");
                isHard = true;
                break;
            }
        }
        if (!isHard) System.out.print("EASY");

        sc.close();
    }
}