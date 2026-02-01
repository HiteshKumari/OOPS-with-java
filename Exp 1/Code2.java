class Area {

    double calculateArea(double r) {
        return 3.14 * r * r;
    }

    double calculateArea(double l, double b) {
        return l * b;
    }

    double calculateArea(double base, double height, boolean triangle) {
        return 0.5 * base * height;
    }
}

public class AreaDemo {
    public static void main(String[] args) {

        Area a = new Area();

        System.out.println("Area of Circle: " + a.calculateArea(7));
        System.out.println("Area of Rectangle: " + a.calculateArea(10, 5));
        System.out.println("Area of Triangle: " + a.calculateArea(8, 6, true));
    }
}
