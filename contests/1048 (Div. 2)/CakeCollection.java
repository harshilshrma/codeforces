/*
Code by Harshil Sharma (https://codeforces.com/profile/harshilshrma)
Date: 08/09/2025
*/

import java.io.*;
import java.util.Arrays;

public class CakeCollection {
    public static void solve(BufferedReader br, BufferedWriter bw) throws IOException {
        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int seconds = Integer.parseInt(line[1]);

        String[] line2 = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(line2[i]);
        }

        Arrays.sort(arr);
        int max = arr[n - 1];
        long cakes = (long) max * seconds;

        // for other (n - 1) ovens 
        int take = Math.min(seconds - 1, n - 1);
        for (int i = n - 2; i >= n - 1 - take; i--) {
            ca
        }

        bw.write(cakes + "\n");
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