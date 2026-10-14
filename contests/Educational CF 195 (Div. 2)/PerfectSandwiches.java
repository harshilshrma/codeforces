import java.io.*;

public class PerfectSandwiches {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] line = br.readLine().split(" ");
            int a = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);

            if (a <= b) {
                bw.write(-1 + "\n");
            } else {
                bw.write(Math.min(b, a - b) + "\n");
            }
        }

        br.close();
        bw.close();
    }
}