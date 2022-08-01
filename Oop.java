abstract class Student {

    abstract void study();
}

class Animal extends Student {
    String name;
    int legs;

    public void detail() {
        System.out.println(this.name);
        System.out.println(this.legs);
        // System.out.println(this.age);

    }

    @Override
    void study() {
        // TODO Auto-generated method stub
        System.out.println("Animal Are not Study");

    }
}

class StudentD extends Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);

    }

    void study() {

        System.out.println("Student are Study");
    }

}

public class Oop {

    public static void main(String[] args) {
        StudentD s1 = new StudentD();
        s1.name = "Ashu";
        s1.age = 22;
        s1.printInfo();
        s1.study();

        StudentD s2 = new StudentD();
        s2.name = "Kaju";
        s2.age = 22;
        s2.printInfo();

        Animal a1 = new Animal();
        a1.name = "cow";
        a1.legs = 4;
        // a1.age = 10;
        a1.detail();
        a1.study();
    }

}
