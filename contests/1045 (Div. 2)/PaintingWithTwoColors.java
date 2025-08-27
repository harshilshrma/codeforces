/*
Code by Harshil Sharma (https://codeforces.com/profile/harshilshrma)
Date: 26/08/2025
*/

import java.io.*;

public class PaintingWithTwoColors {

    public static boolean sameParity(int a, int b) {
        return ((a & 1) == (b & 1));
    }

    public static void solve(BufferedReader br, BufferedWriter bw) throws IOException {
        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int a = Integer.parseInt(line[1]);
        int b = Integer.parseInt(line[2]);

        if (!sameParity(n, b)) { // blue cant be symmetric
            bw.write("NO" + "\n");
        } else { // blue can be divided
            if (a <= b) { // hide red below blue
                bw.write("YES" + "\n");
            } else { // a > b - need to have red and n in same parity
                if (sameParity(n, a)) {
                    bw.write("YES" + "\n");
                } else {
                    bw.write("NO" + "\n");
                }
            }
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