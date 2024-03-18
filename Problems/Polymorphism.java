package Problems;

class Test {
    String name;
    int age;

    // Method Overloading
    public void info(String name) {
        System.out.println("The name of the student is " + this.name);
    }

    public void info(int age) {
        System.out.println("The Age of the student is " + this.age);
    }

}

public class Polymorphism {
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.name = "mohan";
        t1.age = 52;
        t1.info(t1.name);
        

    }
}
