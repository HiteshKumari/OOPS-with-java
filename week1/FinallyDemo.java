public class FinallyDemo {
    public static void main(String[] args) {

        try {
            int result = 10 / 0;
        } catch (Exception e) {
            System.out.println("Exception Occurred");
        } finally {
            System.out.println("Finally Block Executed");
        }
    }
}
