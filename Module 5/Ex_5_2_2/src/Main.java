import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Arrays arr = new Arrays();

        for (int i = 0; i < 2; i++) {
            Thread t1 = new Thread(arr);
            Thread t2 = new Thread(arr);
            Thread t3 = new Thread(arr);

            t1.start(); t2.start();// t3.start();

            try {
                t1.join();
                t2.join();
                t3.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}