import java.util.Scanner;

public class beautifulmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[5][5];
        int row = 0, col = 0;

        // taking input for the matrix
        for (int i = 0; i < 5; i++) {
            String[] line = sc.nextLine().split(" "); 
            for (int j = 0; j < 5; j++) {
                mat[i][j] = Integer.parseInt(line[j]);
            }
        }

        // finding 1 in the matrix
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (mat[i][j] == 1) {
                    row = i;
                    col = j;
                    break;
                }
            }
        }

        // Using manhattan distance formula : (2, 2) is the center of the matrix
        int moves = Math.abs(row - 2) + Math.abs(col - 2); 
        System.out.println(moves);


        
        sc.close();
    }
}
