public class numREV {

    public void printStrrev(String str, int idx) {

        if (idx == 0) {
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printStrrev(str, idx - 1);

    }

    public static void main(String[] args) {
        int n = 123;
        int rev = 0;
        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        System.out.println(rev);

        numREV re = new numREV();
        String str = "123";
        re.printStrrev(str, str.length() - 1);

        System.out.println();

        StringBuilder st = new StringBuilder("Hello");
        st.reverse();
        System.out.println(st);

        // System.out.println(st);
        // for (int i = 0; i < st.length() - 1; i++) {
        // for (int j = i + 1; j < st.length(); i++) {
        // if (i == j) {
        // System.out.print(st.deleteCharAt(i));
        // break;
        // } else {
        // System.out.println();
        // // System.out.print(st.charAt(i));
        // System.out.println(st);
        // }
        // }
        // }
    }

}
