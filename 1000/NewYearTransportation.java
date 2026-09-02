import java.io.*;

public class NewYearTransportation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int t = Integer.parseInt(line[1]);

        int[] a = new int[n + 1];

        String[] line2 = br.readLine().split(" ");
        
        // a[i] tells us how far the portal from cell i jumps.
        for (int i = 1; i < n; i++) {
            a[i] = Integer.parseInt(line2[i - 1]);
        }

        // We start at cell 1
        int x = 1;

        // Keep following portals until we reach or pass t.
        while (x < t) {
            x = x + a[x];
        }

        System.out.println(x == t ? "YES" : "NO");
    }
}