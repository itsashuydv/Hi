import java.util.*;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int fact = 1;// factorial
        int i;

        for (i = 1; i <= num; i++) {
            fact = fact * i;

        }
        System.out.println("Factorial of the number:\n" + fact);

        // fabbonic
        int num1 = 0;
        int num2 = 1;
        System.out.println("fibbonic series:");
        System.out.println(num1);
        System.out.println(num2);
        int num3;
        for (i = 2; i < num; i++) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.println(num3);

        }
        // prime number check
        for (i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                break;
            }
        }
        if (i > num / 2) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }

    }

}
