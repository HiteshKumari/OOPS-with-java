class Employee {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {

        Employee emp = new Employee();
        emp.setName("Hitesh");

        System.out.println(emp.getName());
    }
}
