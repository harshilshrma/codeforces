import java.io.*;
import java.util.ArrayList;

public class NumbersOnWhiteboard {
    static class Pair {
        int a;
        int b;

        public Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }
    private static void solve(BufferedReader br, BufferedWriter bw) throws IOException {
        int n = Integer.parseInt(br.readLine());
        
        bw.write("2\n");

        ArrayList<Pair> list = new ArrayList<>();

        int curr = n;
        for (int i = n - 1; i >= 1; i--) {
            list.add(new Pair(curr, i));
            curr = (curr + i + 1) / 2;
        }

        for (Pair p : list) {
            bw.write(p.a + " " + p.b + "\n");
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
