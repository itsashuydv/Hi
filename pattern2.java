
public class pattern2 {

    public void Triangle2(int n) {

        System.out.println("Pattern 2");

        // System.out.println("Pattern1");

        for (int i = n; i >= 1; i--) {

            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }

            System.out.println();

        }

    }

    public void Triangle1(int n) {
        System.out.println("Pattern 1");

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();

        }

    }

    public void Triangle4(int n) {

        System.out.println("Pattern 4");

        // System.out.println("Pattern1");

        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();

        }

    }

    public void Triangle3(int n) {
        System.out.println("Pattern 3");

        for (int i = 1; i <= n; i++) {

            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }

            System.out.println();

        }

    }

    public static void main(String[] args) {

        pattern2 pt = new pattern2();
        pt.Triangle1(3);
        pt.Triangle2(3);
        pt.Triangle3(3);
        pt.Triangle4(3);

    }
}