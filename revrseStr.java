public class revrseStr {

    public static void re(String str, int indx) {
        if (indx == 0) {
            System.out.print(str.charAt(indx));
            return;
        }
        System.out.print(str.charAt(indx));
        re(str, indx - 1);
    }

    public static void main(String[] args) {
        String str = "ashu";
        re(str, str.length() - 1);

    }

}
