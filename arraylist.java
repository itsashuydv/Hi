import java.util.*;

public class arraylist {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element:");
        List<String> list = new ArrayList<>();
        while (true) {

            list.add(sc.nextLine());
            System.out.println(sc.toString());

        }

    }
}
