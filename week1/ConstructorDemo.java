class Student {

    String name;

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + name);
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Hitesh");
        s1.display();
    }
}
