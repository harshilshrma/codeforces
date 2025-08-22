import java.io.*;

public class Homework {
    public static void solve(BufferedReader br, BufferedWriter bw) throws IOException {
        int n = Integer.parseInt(br.readLine());
        String a = br.readLine();
        int m = Integer.parseInt(br.readLine());
        String b = br.readLine();
        String c = br.readLine();
        char[] arr = c.toCharArray();

        StringBuilder str = new StringBuilder(a);

        for (int i = 0; i < m; i++) {
            if (arr[i] == 'D') {
                str.append(b.charAt(i));
            } else {
                str.insert(0, b.charAt(i));
            }
        }

        System.out.println(str.toString());
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