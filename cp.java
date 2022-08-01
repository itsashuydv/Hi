public class cp {

    public static void main(String[] args) {
        int num = 5;
        int count = 0;
        for (int i = 1; i <= num; i++) {

            if (num % i == 0) {
                count++;
            }

        }
        if (count == 2) {
            System.out.println("Prime");

        } else {
            System.out.println("Not Prime");
        }

        // Factorial

        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println(fact);

        // fibnonaaci

        int num1 = 0;
        int num2 = 1;
        int num3 = 0;

        System.out.println(num1);
        System.out.println(num2);
        for (int i = 2; i <= num; i++) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;

            System.out.println(num3);

        }

    }

}
