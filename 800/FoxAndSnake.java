import java.util.Scanner;
public class FoxAndSnake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);
        boolean flip = true;

        char[][] ans = new char[n][m];
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    ans[i][j] = '#';
                }
            } else {
                for (int j = 0; j < m; j++) {
                    ans[i][j] = '.';
                }
                if (flip) {
                    ans[i][m - 1] = '#';
                } else {
                    ans[i][0] = '#';
                }
                flip = !flip;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}
