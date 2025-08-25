import java.io.*;
import java.util.HashSet;

public class Redstone {
    public static void solve(BufferedReader br, BufferedWriter bw) throws IOException {
        int n = Integer.parseInt(br.readLine());
        String[] line = br.readLine().split(" ");

        HashSet<Integer> set = new HashSet<>();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(line[i]);
        }

        for (int i : arr) {
            set.add(i);
        }

        if (set.size() < arr.length) {
            bw.write("YES"+"\n");
        } else {
            bw.write("NO"+"\n");
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