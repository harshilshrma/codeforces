/*
Code by Harshil Sharma (https://codeforces.com/profile/harshilshrma)
Date: 05/12/2025
*/

import java.io.*;

public class DonutShops {
    public static void solve(BufferedReader br, BufferedWriter bw) throws IOException {
        String[] line = br.readLine().split(" ");
        int a = Integer.parseInt(line[0]);
        int b = Integer.parseInt(line[1]);
        int c = Integer.parseInt(line[2]);

        // for x = 1 donut only
        if (a < c) {
            bw.write(1 + " ");
        } else {
            bw.write(-1 + " ");
        }

        // for b donuts
        if (c < (long) b * a) {
            bw.write(b + " ");
        } else {
            bw.write(-1 + " ");
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