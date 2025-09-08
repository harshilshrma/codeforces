import java.io.*;
import java.util.HashSet;

public class MixMexMax {
    public static void solve(BufferedReader br, BufferedWriter bw) throws IOException {
        int n = Integer.parseInt(br.readLine().trim());

        int[] arr = new int[n];
        String[] line = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(line[i]);
        }

        HashSet<Integer> set = new HashSet<>();
        for (int i : arr) {
            if (i != -1) set.add(i);
        }

        if (set.size() <= 1 && !set.contains(0)) {
            bw.write("YES" + "\n");
        } else {
            bw.write("NO" + "\n");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            solve(br, bw);
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
