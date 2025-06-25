import java.util.ArrayList;
import java.util.HashMap; 
import java.util.Scanner;
public class SumOfRoundNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // hashmap to store the list of digits of each number
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        
        // finding the list of digits of each number
        for (int i = 0; i < arr.length; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            int num = arr[i];
            int placevalue = 1;

            while (num > 0) {
                int digit = num % 10;
                if (digit != 0) {
                    list.add(digit * placevalue);
                }
                placevalue *= 10;
                num /= 10;
            }

            map.put(i, list);
        }

        // printing 
        for (int i = 0; i < arr.length; i++) {
            ArrayList<Integer> list = map.get(i);
            int size = list.size();
            System.out.println(size);

            for (int j : list) {
                System.out.print(j + " ");
            }
            
            System.out.println();
        }

        sc.close();
    }
}