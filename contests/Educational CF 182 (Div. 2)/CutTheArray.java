/*
Code by Harshil Sharma (https://codeforces.com/profile/harshilshrma)
Date: 15/09/2025
*/

import java.io.*;

public class CutTheArray {
    public static boolean check(int l, int r, int[] arr) {
        int sum1 = 0, sum2 = 0, sum3 = 0, n = arr.length;

        // prefix sum
        for (int i = 0; i <= l; i++) {
            sum1 += arr[i];
        }

        // central sum
        for (int i = l + 1; i <= r; i++) {
            sum2 += arr[i];
        }

        // suffix sum
        for (int i = r + 1; i < n; i++) {
            sum3 += arr[i];
        }

        // mod 3
        sum1 %= 3;
        sum2 %= 3;
        sum3 %= 3;
        
        return (sum1 == sum2 && sum2 == sum3) || (sum1 != sum2 && sum2 != sum3 && sum3 != sum1);
    }

    public static void solve(BufferedReader br, BufferedWriter bw) throws IOException {
        int n = Integer.parseInt(br.readLine());
        String[] line = br.readLine().split(" ");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(line[i]);
        }

        boolean isPossible = false;
        for (int l = 0; l < n; l++) {
            for (int r = l + 1; r < n; r++) {
                isPossible = check(l, r, arr);
                if (isPossible) {
                    bw.write((l+1) + " " + (r+1));
                    break;
                }
            }
            if (isPossible) break;
        }

        if (isPossible == false) {
            bw.write(0 + " " + 0);
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