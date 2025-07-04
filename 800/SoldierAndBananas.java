import java.util.Scanner;

public class SoldierAndBananas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputLine = sc.nextLine().split(" ");
        int costOfFirstBanana = Integer.parseInt(inputLine[0]);
        int startingAmount = Integer.parseInt(inputLine[1]);
        int numberOfBananasNeeded = Integer.parseInt(inputLine[2]);

        int amountRequired = 0;
        
        for (int i = 1; i <= numberOfBananasNeeded; i++) {
            amountRequired += i * costOfFirstBanana;
        }

        int amountToBorrow = 0;
        if (amountRequired > startingAmount) {
            amountToBorrow = amountRequired - startingAmount; 
        }

        System.out.println(amountToBorrow);
        sc.close();
    }    
}
