package Java;

import java.util.Scanner;

public class Main {
    public static void prime(int n) {
        if (n <= 1) {
            System.out.println(n + "is not prime");

        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println(n + "is not prime");
                break;

            }
            System.out.println(n + "is prime");

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        prime(n);
    }

}
