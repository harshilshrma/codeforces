import java.io.*;
import java.util.Arrays;

public class Villagers {
    public static void solve(BufferedReader br, BufferedWriter bw) throws IOException {
        int n = Integer.parseInt(br.readLine());
        String[] line = br.readLine().split(" ");   
        long[] arr = new long[n];
        long eme = 0;
        
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(line[i]);
        }

        Arrays.sort(arr);

        for (int i = n - 1; i >= 0; i = i - 2) {
            eme += arr[i];
        }
        
        bw.write(eme + "\n");
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
