public class practice2 {

    static void string(String str, int idx) {
        if (idx == 0) {
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        string(str, idx - 1);
    }

    public static void main(String[] args) {

        String str;
        str = "asdf";
        // String st=new String();
        string(str, str.length() - 1);

    }

}
