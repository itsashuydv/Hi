public class CheckArmstrong {

    public static void main(String[] args) {
        int num = 153;
        int result = 0;
        int digit = 0;
        int orinum = num;
        while (orinum != 0) {

            digit = orinum % 10;
            result += Math.pow(digit, 3);
            orinum /= 10;

        }
        if (result == num) {
            System.out.println(num + " Armstrong");
        } else {
            System.out.println(num + " Not Armstrong");

        }
    }

}
