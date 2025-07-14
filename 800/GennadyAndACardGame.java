import java.util.Scanner;
public class GennadyAndACardGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String onTableCard = sc.nextLine();
        char onTableRank = onTableCard.charAt(0);
        char onTableSuit = onTableCard.charAt(1);

        String[] inHand = sc.nextLine().split(" ");
        boolean canDraw = false;

        for (String card : inHand) {
            char rank = card.charAt(0);
            char suit = card.charAt(1);
            
            if(rank == onTableRank || suit == onTableSuit) {
                canDraw = true;
                break;
            }
        }

        if (canDraw) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
