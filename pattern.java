public class pattern {

    public void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public void printSquare(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {

                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public void printRevTriangle(int n) {

        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {

                System.out.print(" * ");
            }
            System.out.println();
        }

    }

    public void printRevTriangle1(int n) {

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j < i; j++) {

                System.out.print(" ");
            }
            // System.out.println();
            for (int j = 0; j <= n - i; j++) {

                System.out.print("*");

            }
            System.out.println();
        }

    }

    public void printPiramid(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n - i; j++) {

                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            // second part
            for (int j = 2; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j < n - i; j++) {

                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            // second part
            for (int j = 2; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        pattern pt = new pattern();
        pt.printTriangle(5);
        pt.printRevTriangle(5);
        pt.printRevTriangle1(5);
        pt.printPiramid(3);
        pt.printSquare(3);

    }
}