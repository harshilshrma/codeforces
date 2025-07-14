import java.util.Scanner;

public class VanyaAndCubes {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int rowsMade = 0, cubesUsed = 0;
    int idx = 1;

    while (cubesUsed < n) {
      cubesUsed += idx * (idx + 1) / 2;
      idx++;
      if (cubesUsed <= n) rowsMade++;
    }


    System.out.println(rowsMade);
    sc.close();
  }
}