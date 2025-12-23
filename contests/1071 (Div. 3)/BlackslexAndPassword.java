/*
Code by Harshil Sharma (https://codeforces.com/profile/harshilshrma)
Date: 23/12/2025
*/

import java.io.*;

public class BlackslexAndPassword {
    public static void solve(BufferedReader br, BufferedWriter bw) throws IOException {
        String[] line = br.readLine().split(" ");
        int k = Integer.parseInt(line[0]);
        int x = Integer.parseInt(line[1]);

        /*
         * Core idea:
         * Positions i and j conflict if (j - i) % x == 0.
         * This means positions with the same index % x must ALL have different letters.
         * 
         * So the string splits into x independent "buckets":
         * bucket 0 -> positions 1, 1+x, 1+2x, ...
         * bucket 1 -> positions 2, 2+x, 2+2x, ...
         * ...
         * Each bucket must have all unique characters.
         * 
         * Since we only have k letters total,
         * each bucket can have at most k positions.
         * The moment ANY bucket gets k+1 positions, construction becomes impossible.
         * We are asked for the SMALLEST n where this happens.
         */

        int[] cnt = new int[x]; // cnt[i] = how many positions currently in bucket i
        int n = 0; // current length of the string (0-based simulation)

        while (true) {
            /*
             * We add characters one by one.
             * The new character goes to bucket (n % x),
             * because n is the 0-based index of the new position.
             */
            cnt[n % x]++;

            n++; // string length increased by 1

            /*
             * The last added character is at index (n - 1).
             * If its bucket now has more than k positions,
             * we cannot assign distinct letters anymore -> impossible.
             * This n is the smallest invalid length.
             */
            if (cnt[(n - 1) % x] > k) {
                bw.write(n + "\n");
                return;
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
