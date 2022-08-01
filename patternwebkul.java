public class patternwebkul {
    public static void main(String[] args) {
        int n = 3;
        if (n % 2 == 0) {
            System.out.println("Please enter the odd number");
        } else {
            for (int i = 1; i < n; i++) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print("");

                }
                for (int j = i; j >= 1; j--) {
                    System.out.print("*");
                }

                System.out.println();
            }

            for (int i = n; i >= 1; i--) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print("");

                }
                for (int j = i; j >= 1; j--) {

                    System.out.print("*");

                }

                for (int j = i; j >= 1; j--) {
                    if (j == n) {
                        for (int k = 1; k <= n + 2; k++) {
                            System.out.print("@");
                        }
                        for (int k = 1; k <= 2 * n + 2; k++) {
                            if (k == (2 * n + 2)) {
                                for (int p = 1; p <= n; p++) {
                                    for (int c = 1; c <= n; c++) {
                                        System.out.print("*");
                                    }
                                    System.out.println();
                                }

                            }
                        }
                    }
                }

                System.out.println();
            }

        }
    }
}