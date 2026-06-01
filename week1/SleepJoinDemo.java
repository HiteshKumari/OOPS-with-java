public class SleepJoinDemo {

    public static void main(String[] args) throws Exception {

        Thread t = new Thread(() -> {
            for(int i=1;i<=5;i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch(Exception e) {}
            }
        });

        t.start();
        t.join();

        System.out.println("Main Thread Finished");
    }
}
