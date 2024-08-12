import java.util.Scanner;
public class SoftDrinking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int bottles = Integer.parseInt(line[1]);
        int mlOfDrinkInEachBottle = Integer.parseInt(line[2]);
        int limes = Integer.parseInt(line[3]);
        int slices = Integer.parseInt(line[4]);
        int gramsOfSalt = Integer.parseInt(line[5]);
        int mlOfDrinkNeededForToast = Integer.parseInt(line[6]);
        int gramsOfSaltNeededForToast = Integer.parseInt(line[7]);
        
        int totalPossibleDrinks = (bottles * mlOfDrinkInEachBottle) / mlOfDrinkNeededForToast;
        int totalSlices = limes * slices;
        int totalPossibleSalt = gramsOfSalt / gramsOfSaltNeededForToast;
        
        int mini = Math.min(Math.min(totalPossibleDrinks, totalSlices),totalPossibleSalt);
        System.out.println(mini / n);
        
        sc.close();
    }
}
