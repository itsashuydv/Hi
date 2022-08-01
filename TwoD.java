
/**
 * TwoD
 */
import java.util.*;

public class TwoD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row and colon");
        int row = sc.nextInt();
        int col = sc.nextInt();
        System.out.println("Enter the matrix");
        int num[][] = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                num[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the Search number");
        int x = sc.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (x == num[i][j]) {
                    System.out.println(x + " This number are match");
                }
            }
            // System.out.println();
        }

    }

}