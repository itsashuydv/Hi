import java.util.*;

public class sort {

    public static void main(String[] args) {
        int arr[] = new int[] { 52, 45, 32, 64, 12, 87, 78, 98, 23, 7 };
        int temp = 0;

        // print original Array
        System.out.println("Original Arr:");
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");

        }
        // Sorted Array

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        // Sorted array
        System.out.println("\nSorted Arr:");
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }

    }

}
