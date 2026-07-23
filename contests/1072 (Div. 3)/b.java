/*
Code by Harshil Sharma (https://codeforces.com/profile/harshilshrma)
Date: 12/01/2026
*/

import java.io.*;

public class b {
    public static void solve(BufferedReader br, BufferedWriter bw) throws IOException {
        String[] line = br.readLine().split(" ");
        int s = Integer.parseInt(line[0]);
        int k = Integer.parseInt(line[1]);
        int m = Integer.parseInt(line[2]);

        long lastFlip = (m / k) * k;
        long elapsedTime = m - lastFlip;


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