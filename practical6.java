public class practical6 {

    static void revSTR(String str, int idx) {

        if (idx == 0) {
            System.out.println(str.charAt(idx));

            return;
        }
        System.out.print(str.charAt(idx));

        revSTR(str, idx - 1);

    }

    public static void main(String[] args) {

        String str = "1234567";
        String str2 = "1234567";

        revSTR(str, str.length() - 1);

        int idx = str.length() - 1;
        int idx1 = str2.length() - 1;
        if (idx == 0) {
            System.out.println(str.charAt(idx));
            return;
        } else {
            for (int i = idx; i >= 0; i--) {
                System.out.print(str.charAt(i));

            }
            for (int j = idx1; j >= 0; j--) {
                System.out.print(str2.charAt(idx1));

            }
            if (str.charAt(idx) == str2.charAt(idx1)) {

            }
        }

    }

}
