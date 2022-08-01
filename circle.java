import java.util.*;

public class circle {
    void area(float r) {
        float ar = 3.14f * r * r;
        System.out.println("Area is " + ar);
    }

    void circum(float r) {
        float ar = 2f * 3.14f * r;
        System.out.println("circum is " + ar);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        circle x = new circle();
        x.area(r);
        x.circum(r);
    }

}
