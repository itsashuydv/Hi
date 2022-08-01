import java.util.*;

class Reve {

    public void printrR(int n, int rev) {
        while (n > 0) {

            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;

        }
        System.out.println(rev);

        // if (n == rev) {
        // System.out.println("Palindrome");
        // } else {
        // System.out.println("Not Palindrome");
        // }
    }

}

public class freamwork {

    public static void main(String[] args) {

        int array[] = new int[] { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Second Maximum number " + array[array.length - 2]);

        Reve re = new Reve();
        re.printrR(321, 0);

    }

}
