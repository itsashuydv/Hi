
public class Practice3 {

    public static void re(String str, int indx) {
        if (indx == 0) {
            System.out.print(str.charAt(indx));
            return;
        }
        System.out.print(str.charAt(indx));
        re(str, indx - 1);

    }

    public static void revN(int num) {
        int rev = 0;
        while (num > 0) {

            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;

        }
        System.out.println();
        System.out.println(rev);

    }

    // CheckPrime Number

    static void cPrime(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }

        }
        if (count == 2) {
            System.out.println("Prime");
        } else {
            System.out.println("not prime");
        }
    }

    // static void

    public static void main(String[] args) {

        // Practice3 s = new Practice3();
        String str = "ashu";
        re(str, str.length() - 1);
        revN(123);
        cPrime(11);
    }

}
