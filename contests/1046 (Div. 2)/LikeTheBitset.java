import java.io.*;

public class LikeTheBitset {
    public static int[] helper(String s, int n) {
        int num = n;
        int[] perm = new int[n];

        // for 0s - bigger numbers
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') {
                perm[i] = num;
                num--;
            }
        }

        // for 1s - smaller numbers
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                perm[i] = num;
                num--;
            }
        }

        return perm;
    }

    public static boolean earlyCheck(String s, int k) {
        int count = 0, maxConsecutiveCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '1') {
                count++;
            } else {
                count = 0;
            }
            maxConsecutiveCount = Math.max(maxConsecutiveCount, count);
        }

        return (maxConsecutiveCount < k);
    }

    public static void solve(BufferedReader br, BufferedWriter bw) throws IOException {
        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int k = Integer.parseInt(line[1]);

        String s = br.readLine();
        boolean possible = earlyCheck(s, k);

        if (!possible) {
            bw.write("NO" + "\n");
        } else {
            int[] ans = helper(s, n);
            bw.write("YES" + "\n");
            for (int i : ans) {
                bw.write(i + " ");
            }
            bw.write("\n");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            solve(br, bw);
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
