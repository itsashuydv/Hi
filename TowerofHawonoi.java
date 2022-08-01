public class TowerofHawonoi {

    public static void tower(int n, String s, String h, String d) {

        if (n == 1) {
            System.out.println(n + " Transfer From " + s + "  to  " + d);
            return;

        }

        tower(n - 1, s, d, h);
        System.out.println(n + " Transfer From " + s + "  to  " + d);
        tower(n - 1, h, s, d);
    }

    public static void main(String[] args) {
        int n = 3;
        tower(n, "S", "H", "D");
    }

}
