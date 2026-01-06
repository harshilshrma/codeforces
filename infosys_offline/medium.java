package infosys_offline;

import java.io.*;

public class medium {
    public static int maxSubarraySum(int n, int k, int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        



        return maxSum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int ans = maxSubarraySum(n, k, arr);
        bw.write(ans + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
