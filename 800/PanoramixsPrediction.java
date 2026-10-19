import java.io.*;

public class PanoramixsPrediction {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }

        return true;
    }  

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);

        int nextPrimeToN = 0;
        for (int i = n + 1; i <= 50; i++) {
            if (isPrime(i)) {
                nextPrimeToN = i;
                break;
            }
        }

        if (m == nextPrimeToN)  {
            bw.write("YES");
        } else {
            bw.write("NO");
        }

        br.close();
        bw.close();
    }
}