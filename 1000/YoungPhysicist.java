import java.io.*;

public class YoungPhysicist {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int x = 0, y = 0, z = 0;

        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            x += Integer.parseInt(line[0]);
            y += Integer.parseInt(line[1]);
            z += Integer.parseInt(line[2]);
        }

        if (x == 0 && y == 0 && z == 0) {
            bw.write("YES" + "\n");
        } else {
            bw.write("NO" + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}