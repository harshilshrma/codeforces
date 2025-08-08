import java.io.*;

public class PileShuffling {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine()); // number of piles
            long ans = 0;

            for (int i = 0; i < n; i++) {
                String[] line = br.readLine().split(" ");
                int a = Integer.parseInt(line[0]); // current zeros on top
                int b = Integer.parseInt(line[1]); // current ones on bottom
                int c = Integer.parseInt(line[2]); // target zeros on top
                int d = Integer.parseInt(line[3]); // target ones on bottom

                if (b <= d) {
                    // Case where we only need to remove excess zeros
                    ans += Math.max(0, a - c);
                } else {
                    // We have extra ones to remove → must also remove all zeros above
                    ans += a; // remove all top zeros to access bottom ones
                    ans += Math.max(0, b - d); // then remove excess ones
                }
            }

            bw.write(ans + "\n"); // print total operations
        }

        bw.close();
    }
}