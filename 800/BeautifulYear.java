import java.io.*;

public class BeautifulYear {
    public static boolean hasDistinctDigit(int year) {
        int[] nums = new int[10];

        while (year > 0) {
            int rem = year % 10;
            nums[rem]++;
            year = year / 10;
        }

        boolean possible = true;
        for (int i : nums) {
            if (i > 1) {
                possible = false;
                break;
            }
        }

        return possible;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int year = Integer.parseInt(br.readLine());
        int ans = 0;

        while (true) {
            int nextYear = year + 1;

            if (hasDistinctDigit(nextYear)) {
                ans = nextYear;
                break;
            } else {
                year = nextYear;
            }
        }

        bw.write(ans + "\n");

        br.close();
        bw.close();
    }
}