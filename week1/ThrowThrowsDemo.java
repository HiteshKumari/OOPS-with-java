public class ThrowThrowsDemo {

    static void validate(int age) throws Exception {

        if(age < 18) {
            throw new Exception("Not Eligible");
        }

        System.out.println("Eligible");
    }

    public static void main(String[] args) {

        try {
            validate(15);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
