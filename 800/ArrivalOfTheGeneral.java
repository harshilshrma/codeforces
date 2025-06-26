import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class ArrivalOfTheGeneral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] line = sc.nextLine().split(" ");

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(line[i]));
        }
        
        int maxNumber = Collections.max(list);
        int minNumber = Collections.min(list);
        
        int maxIdx = list.indexOf(maxNumber);
        int minIdx = list.lastIndexOf(minNumber);

        int swapsNeeded = maxIdx + (n - 1 - minIdx);
        if (maxIdx > minIdx) swapsNeeded--;
        System.out.print(swapsNeeded);

        sc.close();
    }
}
