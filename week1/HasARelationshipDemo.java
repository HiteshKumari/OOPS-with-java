class Engine {
    void start() {
        System.out.println("Engine Started");
    }
}

class Car {
    Engine engine = new Engine();

    void drive() {
        engine.start();
        System.out.println("Car Running");
    }
}

public class HasARelationshipDemo {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
    }
}
