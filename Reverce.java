class Rev {
    void printrev(String str) {
        if (str.length() == 0) {
            System.out.print(str);
            return;
        }
        System.out.print(str.charAt(str.length() - 1));
        printrev(str.substring(0, str.length() - 1));
    }
}

/**
 * InnerReverce
 */
class palindrome {
    void printpali(String s) {

    }

}

public class Reverce {

    public static void main(String[] args) {

        Rev r = new Rev();
        r.printrev("asdf");

    }

}
