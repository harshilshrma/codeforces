import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class TheSecretNumber {
    public static void solve(BufferedReader br, BufferedWriter bw) throws IOException {
        long n = Long.parseLong(br.readLine());
        ArrayList<Long> list = new ArrayList<>();

        for (int k = 1; k <= 18; k++) {
            long d = 1 + (long) Math.pow(10, k);
            if (n % d == 0) {
                list.add(n / d);
            }
        }

        Collections.sort(list);

        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            if (i > 0)
                System.out.print(" ");
            System.out.print(list.get(i));
        }

        if (list.size() > 0) System.out.println();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            solve(br, bw);
        }

        br.close();
        bw.flush();
        bw.close();
    }
}