/*
Code by Harshil Sharma (https://codeforces.com/profile/harshilshrma)
Date: 03/12/2025
*/

import java.io.*;

public class Game23 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);

        // early checks
        boolean canContinue = true;

        if (m % n != 0) {
            canContinue = false;
            bw.write(String.valueOf(-1));
        } else if (n == m) {
            canContinue = false;
            bw.write(String.valueOf(0));
        }

        // main logic
        // "Is m just n multiplied by some number made only of factors 2 and 3?" 
        // (m = n * ratio) 
        // OR 
        // (m = n × (2^a) × (3^b))

        if (canContinue) {
            int count = 0;
            int ratio = m / n;

            while (ratio % 2 == 0 || ratio % 3 == 0) {
                if (ratio % 2 == 0) {
                    ratio /= 2;
                } else {
                    ratio /= 3;
                }

                count++;
            }

            if (ratio == 1) {
                bw.write(String.valueOf(count));
            } else {
                bw.write(String.valueOf(-1));
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}