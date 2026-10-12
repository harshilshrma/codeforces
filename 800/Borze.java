import java.io.*;

public class Borze {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] line = br.readLine().split("");

        int n = line.length;
        int i = 0;
        StringBuilder str = new StringBuilder();

        while (i < n) {
            if (line[i].equals("-")) {
                if (line[i + 1].equals(".")) {
                    str.append(1);
                } else {
                    str.append(2);
                }
                i += 2;
            } else {
                str.append(0);
                i++;
            }
        }

        bw.write(str.toString());

        br.close();
        bw.close();
    }
}