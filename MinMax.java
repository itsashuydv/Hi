import java.util.*;
import java.util.Arrays;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {

            a[i] = sc.nextInt();

        }

        Arrays.sort(a);

        System.out.println("Min Value is " + a[0]);
        System.out.println("Max Value is " + a[a.length - 1]);

    }
}