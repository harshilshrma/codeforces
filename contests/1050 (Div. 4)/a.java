/*
Code by Harshil Sharma (https://codeforces.com/profile/harshilshrma)
Date: 13/09/2025
*/

import java.io.*;

public class a {
    public static void solve(BufferedReader br, BufferedWriter bw) throws IOException {
        String[] line = br.readLine().split(" ");
        int x = Integer.parseInt(line[0]);
        int n = Integer.parseInt(line[1]);

        if ((n & 1) == 0) {
            bw.write('0' + "\n");
        } else {
            bw.write(x + "\n");
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