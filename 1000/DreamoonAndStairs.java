import java.io.*;

public class DreamoonAndStairs {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);

        int minMoves = (n + 1) / 2;

        // ceil(a/b) = (a+b-1)/b
        
        // ceil(lowerBound/m) * m
        int ans = ((minMoves + m - 1) / m) * m;
        if (ans > n) ans = -1;

        bw.write(String.valueOf(ans));

        bw.flush();
        bw.close();
        br.close();
    }
}