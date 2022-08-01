public class Practice7 {
    // Factorial

    int Fact(int n) {
        int fact = 1;
        if (n == 0 || n == 1) {
            return 1;
        }
        for (int i = 1; i <= n; i++) {
            fact = fact * i;

        }
        return fact;
    }

    // fabonacci
    int fab(int n) {

        int fabo = 0;
        if (n < 2) {
            return n;
        }
        for (int i = 2; i <= n; i++) {

            fabo = fab(n - 1) + fab(n - 2);
        }
        return fabo;
    }

    // PrimeNumber
    int prime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            return 1;
        } else {
            return 0;
        }
        // return 0;
    }

    // reverse number
    int revNum(int n) {
        int rev = 0;
        while (n > 0) {

            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;

        }
        return rev;

    }

    // reverse String
    static void revStr(String str, int idx) {
        if (idx == 0) {
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        revStr(str, idx - 1);
    }

    public static void main(String[] args) {

        System.out.println(new Practice7().Fact(5));
        System.out.println(new Practice7().fab(10));
        System.out.println(new Practice7().prime(13));
        System.out.println(new Practice7().revNum(123));
        String str = "ashu kumar";
        revStr(str, str.length() - 1);

    }

}
