/*
Code by Harshil Sharma (https://codeforces.com/profile/harshilshrma)
Date: 26/08/2025
*/

import java.io.*;

public class Add0OrK {

    public static void solve(BufferedReader br, BufferedWriter bw) throws IOException {
        String[] line1 = br.readLine().split(" ");
        int n = Integer.parseInt(line1[0]);
        long k = Long.parseLong(line1[1]);

        long[] arr = new long[n];
        String[] line2 = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(line2[i]);
            arr[i] += (arr[i] % (k + 1)) * k;
        }

        for (long i : arr) {
            bw.write(i + " ");
        }
        bw.write("\n");
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
