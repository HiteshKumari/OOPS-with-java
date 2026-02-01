class Student {
    int rollNo;
    String name;
    int age;

    Student() {
        rollNo = 0;
        name = "Not Assigned";
        age = 0;
    }

    Student(int r, String n, int a) {
        rollNo = r;
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(101, "Hitesh", 19);

        System.out.println("Student 1 Details:");
        s1.display();

        System.out.println("Student 2 Details:");
        s2.display();
    }
}
