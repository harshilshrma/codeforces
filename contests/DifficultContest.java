import java.util.Scanner;

public class DifficultContest {
    public static void solve(Scanner sc) {
        String s = sc.nextLine();

        while (s.contains("NTT") || s.contains("FFT")) {
            s = s.replace("NTT", "TTN");
            s = s.replace("FFT", "FTF");
        }
        
        System.out.println(s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            solve(sc);
        }
    }
}
