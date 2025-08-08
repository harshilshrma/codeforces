import java.io.*;

public class NoCasinoInTheMountains {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String[] nk = br.readLine().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);

            int[] a = new int[n];
            String[] arr = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(arr[i]);
            }

            int ans = 0;
            int cnt = 0;

            for (int i = 0; i < n; i++) {
                if (a[i] == 0) {
                    cnt++;  // building a block of good days
                } else {
                    ans += (cnt + 1) / (k + 1);
                    cnt = 0;  // reset on bad weather
                }
            }

            // handle last block (if it ends with 0s)
            ans += (cnt + 1) / (k + 1);

            bw.write(ans + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
