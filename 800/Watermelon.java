import java.io.*;

public class Watermelon {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int w = Integer.parseInt(br.readLine());
        if (w > 2 && (w & 1) == 0) {
            bw.write("YES");  
        } else {
            bw.write("NO");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
