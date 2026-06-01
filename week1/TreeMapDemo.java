import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(1, "Java");
        map.put(3, "Spring");
        map.put(2, "Hibernate");

        System.out.println(map);
    }
}
