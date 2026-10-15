import java.io.*;
import java.util.Arrays;

public class LightsOut {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // initial config
        int[][] arr = new int[3][3];

        // input
        int[][] input = new int[3][3];
        for (int i = 0; i < 3; i++) {
            String[] line = br.readLine().split(" ");
            int j = Integer.parseInt(line[0]);
            int k = Integer.parseInt(line[1]);
            int l = Integer.parseInt(line[2]);
            input[i][0] = j;
            input[i][1] = k;
            input[i][2] = l; 
        }

        // simulate
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3 ; j++) {
                if (input[i][j] % 2 != 0) {
                    arr[i][j]++;
                    if (i > 0) arr[i - 1][j]++; // up
                    if (i < 2) arr[i + 1][j]++; // down
                    if (j > 0) arr[i][j - 1]++; // left
                    if (j < 2) arr[i][j + 1]++;  // right
                }
            }
        }

        // print ans
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] % 2 != 0) {
                    bw.write('0');
                } else {
                    bw.write('1');
                }
            }
            bw.write("\n");
        }

        br.close();
        bw.close();
    }
}