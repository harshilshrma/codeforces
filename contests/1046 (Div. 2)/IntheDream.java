import java.io.*;

public class IntheDream {
    static boolean canHalfWork(int x, int y) {
        int L = Math.max(x, y);
        int S = Math.min(x, y);
        return S >= ((L + 1) / 2) - 1;
    }
    
    public static void solve(BufferedReader br, BufferedWriter bw) throws IOException {
        String[] line = br.readLine().split(" ");
        int a = Integer.parseInt(line[0]);
        int b = Integer.parseInt(line[1]);
        int c = Integer.parseInt(line[2]);
        int d = Integer.parseInt(line[3]);

        boolean possible = canHalfWork(a, b) && canHalfWork(c - a, d - b);

        if (possible) {
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

        br.close();
        bw.flush();
        bw.close();
    }
}
