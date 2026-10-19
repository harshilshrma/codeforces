import java.io.*;

public class Word {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();

        int upper = 0, lower = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (Character.isLowerCase(c)) lower++;
            else upper++;
        }

        String ans = upper > lower ? word.toUpperCase() : word.toLowerCase();
        bw.write(ans);

        br.close();
        bw.close();
    }
}