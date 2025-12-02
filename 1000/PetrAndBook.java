import java.io.*;
import java.util.Arrays;

public class PetrAndBook {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");

        int i = 0;
        int currSum = 0;
        int day = 1;

        while (true) {
            currSum += Integer.parseInt(arr[i]);
            
            if (currSum >= n) {
                bw.write(String.valueOf(day));
                break;
            }
            
            day = (day % 7) + 1;
            i = (i + 1) % 7;
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
