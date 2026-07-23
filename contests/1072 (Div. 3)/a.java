import java.io.*;

public class a {
    public static void solve(BufferedReader br, BufferedWriter bw) throws IOException {
        int n = Integer.parseInt(br.readLine());
        
        if (n == 2) {
            bw.write(2 + "\n");
        } else if (n == 3) {
            bw.write(3 + "\n");
        } else if (n % 2 == 0) {
            bw.write(0 + "\n");
        } else {
            bw.write(1 + "\n");
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