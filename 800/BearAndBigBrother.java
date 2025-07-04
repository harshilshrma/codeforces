import java.util.Scanner;
public class BearAndBigBrother {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String[] inputLine = sc.nextLine().split(" ");
        int weightLimak = Integer.parseInt(inputLine[0]);
        int weightBob = Integer.parseInt(inputLine[1]);
        int yearsRequired = 0;

        while (weightLimak <= weightBob) { 
            weightLimak = weightLimak * 3;
            weightBob = weightBob * 2;
            yearsRequired++;
        }

        System.out.println(yearsRequired);
        sc.close();
    }
}
