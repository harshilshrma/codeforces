/*
Code by Harshil Sharma (https://codeforces.com/profile/harshilshrma)
Date: 05/12/2025
*/

import java.io.*;

public class Buttons {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        // At stage k, we have already identified the first (k - 1) buttons of the sequence.
        // Now we are trying to find the k-th button.

        // There are (n - k) wrong candidates remaining (because 1 of the remaining is correct).
        // For each wrong guess, the lock resets, meaning we must press the already-confirmed (k - 1) buttons again, followed by testing a new candidate for position k.

        // That means each wrong attempt at stage k costs exactly k presses:
        // (k - 1) presses to replay the confirmed prefix, plus 1 press for the new test. (k - 1 + 1 = k) 

        // Since there are (n - k) wrong possibilities before the correct one, the
        // wasted cost at stage k is: k * (n - k)

        // Example for n = 3 (sequence unknown, worst case order):
        // Stage 1: k = 1 → wrong possibilities: 3 - 1 = 2
        // each wrong press costs 1 → wasted = 1 * 2 = 2

        // Stage 2: k = 2 → wrong possibilities: 3 - 2 = 1
        // each wrong press costs 2 → wasted = 2 * 1 = 2

        // Total wasted before final correct sequence: 2 + 2 = 4

        // Once all buttons have been identified, one final pass of the correct full sequence of length n is required to open the lock.
        // So we add n to the final cost.

        // Total worst-case presses = (sum of k * (n - k) for k = 1 ... n-1) + n

        long ans = ((long)(n - 1) * (n + 1) * n) / 6 + n;
        bw.write(String.valueOf(ans));

        bw.flush();
        bw.close();
        br.close();
    }
}