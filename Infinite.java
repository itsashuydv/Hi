import Java.Arrays;

public class Infinite {

    public static void main(String[] args) {
        int num = 153;
        int res = 0;
        int newN = num;
        int digit = 0;
        while (newN != 0) {
            digit = newN % 10;
            res += Math.pow(digit, 3);
            newN /= 10;

        }
        if (res == newN) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }

        // fibbonacci
        int NUM = 5;
        int n0 = 0;
        int n1 = 1;
        int n2 = 0;
        System.out.print(n0 + " ");
        System.out.print(n1 + " ");

        for (int i = 2; i <= NUM; i++) {

            n2 = n0 + n1;
            n0 = n1;
            n1 = n2;

            System.out.print(n2 + " ");

        }
        System.out.println();

        // fictorial
        int numF = 5;
        int fact = 1;
        for (int i = 1; i <= numF; i++) {

            fact *= i;

        }
        System.out.println("Factorial is " + fact);

        // checkPrime
        int nump = 6;
        int count = 0;
        for (int i = 1; i <= nump; i++) {
            if (nump % i == 0) {
                count++;
            }

        }
        if (count == 2) {
            System.out.println(nump + " is prime");
        } else {
            System.out.println(nump + " is not prime");
        }

        // reverse number
        int nr = 123;
        int result = 0;
        int digit1 = 0;
        while (nr > 0) {
            digit1 = nr % 10;
            result = result * 10 + digit1;
            nr = nr / 10;
        }
        System.out.println(result);

        // Array sort

    }

}
