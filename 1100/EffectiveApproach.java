import java.io.*;
import java.util.StringTokenizer;

public class EffectiveApproach {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] pos = new int[n + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            pos[num] = i + 1;
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        long cnt1 = 0, cnt2 = 0;

        for (int i = 0; i < m; i++) {
            int target = Integer.parseInt(st.nextToken());

            cnt1 += pos[target];
            cnt2 += n - pos[target] + 1;
        }

        bw.write(cnt1 + " " + cnt2);

        br.close();
        bw.close();
    }
}