class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.age);
        System.out.println(this.name);
    }
}

public class Obj {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.age = 22;
        s1.name = "Ashu";
        s1.printInfo();

    }

}
