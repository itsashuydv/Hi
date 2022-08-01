// import javax.sql.rowset.spi.SyncResolver;

public class fiboDynamic {

    // fibbonacci
    int count1;
    int count2;

    int fibonacci(int num) {
        count1++;

        if (num < 2) {
            return num;
        }

        return fibonacci(num - 1) + fibonacci(num - 2);

    }

    // Dynamic
    int fibd(int n) {
        int a[] = new int[n + 1];
        a[0] = 0;
        a[1] = 1;
        for (int i = 2; i <= n; i++) {
            a[i] = a[i - 1] + a[i - 2];
            count2++;

        }

        return a[n];
    }

    public static void main(String[] args) {

        System.out.println(new fiboDynamic().fibonacci(10));
        System.out.println(new fiboDynamic().count1);
        System.out.println(new fiboDynamic().fibd(10));
        System.out.println(new fiboDynamic().count2);

    }
}