import java.io.*;

public class TheCunningSellerEASY {
    public static int findLargestIdx(long[] size, int n) {
        int l = 0, r = size.length - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (size[mid] <= n) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        } 
        return ans;
    }
    public static void solve(BufferedReader br, BufferedWriter bw) throws IOException {
        int n = Integer.parseInt(br.readLine());
        long[] size = new long[19];
        long[] cost = new long[19];

        size[0] = 1;
        cost[0] = 3;

        for (int i = 1; i < 19; i++) {
            size[i] = size[i - 1] * 3;
            cost[i] = (long) Math.pow(3, i + 1) + (long) i * size[i - 1];
        }

        long totalCost = 0;
        while (n != 0) {
            int largestIdx = findLargestIdx(size, n);
            n -= size[largestIdx];
            totalCost += cost[largestIdx];
        }

        System.out.println(totalCost);
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