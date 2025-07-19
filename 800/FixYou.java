    import java.util.Scanner;

    public class FixYou {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();
                int m = sc.nextInt();
                sc.nextLine();

                // taking the matrix input
                char[][] arr = new char[n][m];
                for (int j = 0; j < n; j++) {
                    String line = sc.nextLine();
                    arr[j] = line.toCharArray();
                }
                
                int ans = 0;

                // if single element
                if (n == 1 && m == 1) {
                    System.out.println(0);
                    continue;
                }

                // top -> first row 
                if (n == 1) { // (only checking if single row)
                    for (int j = 0; j < m; j++) {
                        if (arr[0][j] == 'D') ans++;
                    }
                } else {
                    if (arr[0][m - 1] == 'R') ans++;
                }

                // right -> last column
                for (int j = 1; j < n; j++) {
                    if (arr[j][m - 1] == 'R') ans++;
                }

                // bottom -> last row
                if (n > 1) {
                    for (int j = 0; j < m - 1; j++) {
                        if (arr[n - 1][j] == 'D') ans++;
                    }
                }
                System.out.println(ans);
            }

            sc.close();

        }
    }
