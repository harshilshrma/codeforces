import java.io.*;

public class Chocolates {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] line = br.readLine().split(" ");

        int[] choc = new int[n];
        for (int i = 0; i < n; i++) {
            choc[i] = Integer.parseInt(line[i]);
        }

        long ans = 0;

        long previous = choc[n - 1];
        ans += previous;

        for (int i = n - 2; i >= 0; i--) {
            previous = Math.max(0 , Math.min(previous - 1, choc[i]));
            ans += previous;
        }

        bw.write(ans + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}