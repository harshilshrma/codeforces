import java.util.Arrays;
import java.util.Scanner;
public class TheNewYearMeetingFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        int p1 = Integer.parseInt(line[0]);
        int p2 = Integer.parseInt(line[1]);
        int p3 = Integer.parseInt(line[2]);

        int[] arr = new int[]{p1, p2, p3};
        Arrays.sort(arr);

        int minDist = arr[2] - arr[0];
        System.out.println(minDist);

        sc.close();
    }
}
