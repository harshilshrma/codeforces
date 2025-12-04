/*
Code by Harshil Sharma (https://codeforces.com/profile/harshilshrma)
Date: 04/12/2025
*/

import java.io.*;
import java.util.ArrayList;

public class PresentFromLena {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        // total 2n-1 strings
        // initial spaces = 2n - 2i (i = line number)

        ArrayList<String> list = new ArrayList<>();

        // forming first half, till center
        for (int i = 0; i <= n; i++) {
            StringBuilder str = new StringBuilder();

            // adding initial spaces
            int initialSpaces = 2 * (n - i);
            for (int j = 0; j < initialSpaces; j++) {
                str.append(" ");
            }

            // left half of rhombus
            for (int j = 0; j <= i; j++) {
                str.append(j);
                if (i != 0)
                    str.append(" ");
            }

            // right half of rhombus
            for (int j = i - 1; j >= 0; j--) {
                str.append(j);
                if (j != 0)
                    str.append(" ");
            }

            list.add(str.toString());
        }

        // adding final strings from previous half
        for (int i = 0; i < n; i++) {
            list.add(list.get(n - i - 1));
        }

        // printing strings
        for (String s : list) {
            bw.write(s + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}