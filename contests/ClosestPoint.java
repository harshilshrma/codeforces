package contests;
import java.util.*;
public class ClosestPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder output = new StringBuilder();

        while(t-- > 0) {
            int n = sc.nextInt();
            int[] points = new int[n];
 
            for (int j = 0; j < n; j++) {
                points[j] = sc.nextInt();
            }
            
            int mingap = Integer.MAX_VALUE;
            for (int j = 1; j < n; j++) {
                int gap = points[j] - points[j - 1];
                mingap = Math.min(mingap, gap);
            }   

            if (mingap == 1) {
                output.append("NO\n");
            } else {
                output.append("YES\n");
            }
        }

        System.out.print(output.toString());
        sc.close();
    }
}
