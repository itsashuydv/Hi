
public class Practice4 {

    // Rverse of String
    static void revSTR(String str, int idx) {
        if (str == "") {
            return;
        }
        if (idx == 0) {
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        revSTR(str, idx - 1);

    }

    public static void main(String[] args) {

        // Factorial
        int n = 11;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + fact);

        // Fabonacci

        int num0 = 0;
        int num1 = 1;
        int num2;
        System.out.print("Fabonacci series: ");
        System.out.print(num0 + " ");
        System.out.print(num1 + " ");

        for (int i = 2; i <= n; i++) {
            num2 = num0 + num1;
            num0 = num1;
            num1 = num2;
            System.out.print(num2 + " ");
        }

        System.out.println();

        // Sum of Natural Number

        int sum = 0;
        for (int i = 1; i <= n; i++) {

            sum += i;

        }
        System.out.println("Sum of Natural Number " + sum);

        // Check the Prime Number
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;

        }
        if (count == 2) {
            System.out.println(n + " is Prime ");
        } else {
            System.out.println(n + " is Not Prime ");
        }

        // Revrse of Number
        int rev = 0;
        int temp = n;
        while (n > 0) {

            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;

        }
        System.out.println("Reverse of " + rev);
        // check Palindrome number
        if (temp == rev) {
            System.out.println(temp + " Palindrome");
        } else {
            System.out.println(temp + " is Not Palindrome");
        }

        // Reverse of String
        String str = "mom";
        revSTR(str, str.length() - 1);

        // Reverse of String 2nd method
        System.out.println();
        char curr;
        String newstr = "";
        String tem = str;
        if (str == "") {
            return;
        }
        for (int i = 0; i < str.length(); i++) {

            curr = str.charAt(i);
            newstr = curr + newstr;

        }
        System.out.println(newstr);

        // check to the string is Palindrome

        if (tem.equals(newstr)) {
            System.out.println(tem + " String is Palindrome");
        } else {
            System.out.println(tem + " String is Not Palindrome");
        }

    }

}