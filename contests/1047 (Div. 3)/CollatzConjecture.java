/*
Code by Harshil Sharma (https://codeforces.com/profile/harshilshrma)
Date: 07/09/2025
*/

import java.io.*;

public class CollatzConjecture {
    public static void solve(BufferedReader br, BufferedWriter bw) throws IOException {
        String[] line = br.readLine().split(" ");
        int k = Integer.parseInt(line[0]);
        int x = Integer.parseInt(line[1]);

        bw.write(x * (1 << k) + "\n");
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