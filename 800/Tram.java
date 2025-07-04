import java.util.Scanner;

public class Tram {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int currentCapacity = 0;
        int maxCapacity = 0;

        for (int i = 0; i < n; i++) {
            String[] line = sc.nextLine().split(" ");
            int exitingPeople = Integer.parseInt(line[0]);
            int enteringPeople = Integer.parseInt(line[1]);

            currentCapacity += enteringPeople;
            currentCapacity -= exitingPeople;

            if (currentCapacity > maxCapacity) {
                maxCapacity = currentCapacity;
              }
        }
        
        System.out.print(maxCapacity);
        sc.close();
  }
}