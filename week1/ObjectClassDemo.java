class Student {
    String name = "Hitesh";

    @Override
    public String toString() {
        return name;
    }
}

public class ObjectClassDemo {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.toString());
    }
}
