import java.util.Scanner;

public class AddOrXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < t; i++) {
            String[] inputLine = sc.nextLine().split(" ");
            int a = Integer.parseInt(inputLine[0]);
            int b = Integer.parseInt(inputLine[1]);
            int x = Integer.parseInt(inputLine[2]);
            int y = Integer.parseInt(inputLine[3]);
            int ops = 0;

            while (a < b) {
                // a is even, both ops do ++; we pick min
                if (a % 2 == 0) {
                    if (x < y) {
                        a++;
                        ops += x;
                    } else {
                        a++;
                        ops += y;
                    }
                } else { // a is odd, x does ++, y does --; we need only ++
                    a++;
                    ops += x;
                }
                if (a == b) break;
            }

            while (a > b) {
                // a is even and can only do ++ but we want to -- (no chance)
                if (a % 2 == 0) {
                    ops = -1;
                    break;
                } else { // a is odd, we can only -- once else loop
                    if (a - b > 1) {
                        ops = -1;
                        break;
                    } else {
                        ops += y;
                        break;
                    }
                }
            }
            
            System.out.println(ops);
        }

        sc.close();
    }
}
