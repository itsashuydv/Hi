public class RecursionSumN {

    public static void print(int n, int i, int sum) {

        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }

        sum = sum + i;
        print(n, i + 1, sum);

    }

    public static void printFact(int n, int fact, int i) {
        if (n == i) {
            fact *= i;
            System.out.println(fact);
            return;
        }
        fact *= i;
        printFact(n, fact, i + 1);
    }

    public static void fibo(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        fibo(b, c, n - 1);

    }

    public static void main(String[] args) {
        print(10, 1, 0);
        printFact(1, 5, 1);
        System.out.println("0");
        System.out.println("1");
        int n = 7;
        fibo(0, 1, n - 2);

    }
}
