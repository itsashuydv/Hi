import java.util.*;

class Factorial {
    public void printFact(int n, int fact) {
        for (int i = 1; i <= n; i++) {

            fact *= i;
        }
        System.out.println("Factorial of " + fact);
    }
}

class Fabonacci {
    public void printFabo(int num0, int num1, int sum, int num) {
        System.out.println("0");
        System.out.println("1");

        for (int i = 2; i <= num; i++) {
            sum = num0 + num1;
            num0 = num1;
            num1 = sum;
            System.out.println(sum);
        }

    }
}

class CheckPrime {

    public void printCheckPrime(int num) {

        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println("Number is Prime ");
        }

        else {
            System.out.println(num + " Number is not  Prime ");
        }

    }

}

class Sort {
    public void printSort(int arr[]) {

        int temp = 0;
        System.out.println("Original Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        // Sorted Array
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        // Final Array
        System.out.println("\nSorted Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        // 2nd Maximum Number
        for (int i = arr.length - 2; i <= arr.length - 2; i++) {
            System.out.print("\n" + arr[i]);
        }

    }

    public void printSort(int[] is, int i, int j) {
    }
}

public class Random {

    public static void main(String[] args) {

        Factorial fcat = new Factorial();
        fcat.printFact(5, 1);

        Fabonacci fabo = new Fabonacci();
        fabo.printFabo(0, 1, 0, 8);

        CheckPrime cp = new CheckPrime();
        cp.printCheckPrime(15);

        Sort sort = new Sort();

        int[] arr = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        sort.printSort(arr);

    }

}
