public class PracticeDP {

    // Fabonacci Dynamic

    int Fab(int n) {
        int arr[] = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }

    // Factorial Dynamic

    int Fac(int m) {
        if (m < 2) {
            return m;
        }
        int arr[] = new int[m + 1];
        arr[1] = 1;
        arr[0] = 1;

        for (int i = 2; i <= m; i++) {

            arr[i] = arr[i - 1] * i;

        }
        return arr[m];

    }

    public static void main(String[] args) {

        System.out.println(new PracticeDP().Fab(10));
        System.out.println(new PracticeDP().Fac(10));

    }

}
