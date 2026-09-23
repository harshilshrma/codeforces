import java.io.*;

public class QueueAtTheSchool {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int t = Integer.parseInt(line[1]);

        String s = br.readLine();
        char[] arr = s.toCharArray();
        
        while (t-- > 0) {
            int i = 0;  
            while (i < n - 1) {
                if (arr[i] == 'B' && arr[i + 1] == 'G') {
                    arr[i] = 'G';
                    arr[i + 1] = 'B';
                    i += 2;
                } else {
                    i++;
                }
            }
        }

        bw.write(new String(arr) + "\n");

        br.close();
        bw.close();
    }
}