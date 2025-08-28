import java.io.*;
import java.util.*;

public class AgainstTheDifference {
    public static void solve(BufferedReader br, BufferedWriter bw) throws IOException {
        int n = Integer.parseInt(br.readLine().trim()); 
        String[] line = br.readLine().split(" "); 

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(line[i]); 
        }

        // pos[v] = list of indices where value v appears in array
        // we build this so we can quickly know positions of each number
        List<List<Integer>> pos = new ArrayList<>();
        for (int i = 0; i <= n; i++) { 
            // we only need up to n since value cannot exceed n (block length ≤ n)
            pos.add(new ArrayList<>());
        }

        // dp[i] = maximum contribution we can achieve using first i elements (0..i)
        int[] dp = new int[n]; 

        for (int i = 0; i < n; i++) {
            // current value at index i
            int v = a[i]; 
            // record that v occurs at index i
            pos.get(v).add(i); 

            // default: skip this element → carry forward best answer till i-1
            dp[i] = (i > 0 ? dp[i - 1] : 0); 

            // Now, check if we can form a "complete block" of value v ending at index i
            // number of times value v has appeared so far (till index i)
            int occ = pos.get(v).size(); 

            if (occ >= v) { 
                // only possible if we have at least v occurrences of v
                // e.g. for v=3, we need at least 3 threes to form a block

                // find index of the first element of this block
                // (take the (occ - v)-th occurrence of v, because last v elements are the block)
                int startIndex = pos.get(v).get(occ - v); 

                // best contribution achievable before this block started
                int prev = (startIndex > 0 ? dp[startIndex - 1] : 0); 

                // contribution if we include this block (add size v to prev answer)
                int candidate = prev + v; 

                // take max of skipping vs forming block
                dp[i] = Math.max(dp[i], candidate); 
            }
        }

        // answer = dp at last index (using whole array)
        bw.write(dp[n - 1] + "\n"); 
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine().trim()); 

        while (t-- > 0) {
            solve(br, bw); 
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
