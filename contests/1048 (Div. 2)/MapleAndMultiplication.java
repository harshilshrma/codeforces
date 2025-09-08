/*
Code by Harshil Sharma (https://codeforces.com/profile/harshilshrma)
Date: 08/09/2025
*/

import java.io.*;

public class MapleAndMultiplication {
    public static void solve(BufferedReader br, BufferedWriter bw) throws IOException {
        String[] line = br.readLine().split(" ");
        int a = Integer.parseInt(line[0]);
        int b = Integer.parseInt(line[1]);
        
        if (a == b) {
            bw.write(0 + "\n");
            return;
        }

        if (a % b == 0 || b % a == 0) {
            bw.write(1 + "\n");
        } else {
            bw.write(2 + "\n");
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