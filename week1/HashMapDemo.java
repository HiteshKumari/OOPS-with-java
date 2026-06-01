import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(1, "Hitesh");
        students.put(2, "Rahul");
        students.put(3, "Priya");

        System.out.println(students);
    }
}
