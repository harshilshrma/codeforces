import java.io.*;

public class KString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // input
        int k = Integer.parseInt(br.readLine());
        String s = br.readLine();

        // freq array for chars
        int[] countArr = new int[26];
        for (char c : s.toCharArray()) {
            countArr[c - 'a']++;
        }

        // early check for incompatibility
        boolean cant = false;
        for (int i : countArr) {
            if (i % k != 0) {
                cant = true;
                break;
            }
        }

        // main logic
        if (cant) {
            bw.write(String.valueOf(-1));
        } else {
            // creating base string to repeat k times
            StringBuilder baseStr = new StringBuilder();
            
            for (int i = 0; i < 26; i++) {
                if (countArr[i] == 0) continue;

                char c = (char) (i + 'a');
                int repetition = countArr[i] / k;

                for (int j = 0; j < repetition; j++) {
                    baseStr.append(c);
                }
            }

            // creating final string by repeating base 'k' times
            StringBuilder finalStr = new StringBuilder();
            for (int i = 0; i < k; i++) {
                finalStr.append(baseStr);
            }

            // printing the final string
            bw.write(finalStr.toString());
        }

        br.close();
        bw.flush();
        bw.close();
    }
}