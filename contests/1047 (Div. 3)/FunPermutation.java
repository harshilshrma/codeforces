/*
Code by Harshil Sharma (https://codeforces.com/profile/harshilshrma)
Date: 07/09/2025
*/

import java.io.*;
import java.util.ArrayList;

public class FunPermutation {
    public static void solve(BufferedReader br, BufferedWriter bw) throws IOException {
        int n = Integer.parseInt(br.readLine());
        String[] line = br.readLine().split(" ");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(line[i]);
        }

        ArrayList<Integer> list = new ArrayList<>(;
        

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