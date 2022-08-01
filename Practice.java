public class Practice {

    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a);
        System.out.println(b);

        // Prime Number
        int num = 6;
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }

        }
        if (count == 2) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime Number");
        }

        // Factorial

        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println(fact);

        // Fabonaccci
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

        // Sorting
        int arr[] = new int[] { 98, 7, 5, 43, 23, 43 };
        int temp;
        // Original Array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Sorted Algo
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
