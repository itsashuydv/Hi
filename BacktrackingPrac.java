public class BacktrackingPrac {
    static void Print(String str, String pre, int idx) {
        if (str.length() == 0) {
            System.out.println(pre);
        }
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            Print(newStr, pre + curr, idx + 1);
        }

    }

    public static void main(String[] args) {
        String str = "abc";
        Print(str, "", 0);
        back(str, "", 0);
    }

    static void back(String str, String pre, int idx) {
        if (str.length() == 0) {
            System.out.println(pre);
        }
        for (int i = 0; i < str.length(); i++) {

            char curr = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i + 1);
            back(newstr, pre + curr, idx + 1);

        }
    }
}
