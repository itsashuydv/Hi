public class Recurrence2 {
    public static String revString(String str) {
        if (str.length() == 1) {
            return str;
        }
        char currChar = str.charAt(0);
        String nextString = revString(str.substring(1));
        return nextString + currChar;
    }

    public static void main(String args[]) {
        String str = "123";
        String reversed = revString(str);
        System.out.println(reversed);

        // palindrome

        if (reversed.equals(str)) {
            System.out.println(str + " palindrome");
        } else {
            System.out.println(str + " Not palindrome");
        }
    }
}