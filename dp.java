
public class dp {
    // Normal

    int fab1(int n) {

        if (n < 2)
            return n;
        else {
            return fab1(n - 1) + fab1(n - 2);
        }

    }

    // Dynamic
    int fab(int n) {
        int arr[] = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++) {

            arr[i] = arr[i - 1] + arr[i - 2];

        }
        return arr[n];

    }

    public static void main(String[] args) {

        System.out.println(new dp().fab(10));
        System.out.println(new dp().fab1(10));

    }

}
