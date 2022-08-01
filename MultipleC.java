public class MultipleC {

    int a = 10;
    String name;

    public static void main(String[] args) {
        MultipleC myObj = new MultipleC();// First Class
        System.out.println(myObj.a);
        // Call to the Car Class
        Car myObjCar = new Car();
        System.out.println(myObjCar.carName);

    }

}
