import java.util.Arrays;

public class Arraysort {

    public static void main(String[] args) {
        int arr[] = new int[] { 1078, 65, 345, 67, 3, 1, 2, 4 };
        int temp = 0;

        // Arrays.sort(arr);

        // Original Array
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

}
