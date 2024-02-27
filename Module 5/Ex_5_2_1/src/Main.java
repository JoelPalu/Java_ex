import java.util.Random;

public class Main {


    static int tickets = 20;
    static int reserverd = 0;

    static class Customer implements Runnable {
        Random r = new Random();
        static int customers = 1;
        int id;

        Customer() {
            id = customers++;
        }

        public void run() {


            int reserve = r.nextInt(1,4);
            synchronized (this) {
                if (reserve <= tickets - reserverd) {
                    System.out.println(reserve + " tickets reserved for customer " + id);
                    reserverd += reserve;
                    //System.out.println("Tickets left: " + (tickets - reserverd));
                    //System.out.println("Tickets reserved: " + reserverd);
                } else {
                    System.out.println("Customer " + id + " Couldn't reserve " + reserve + " tickets");
                }
            }
        }
    }

    public static void main(String[] args) {


        for (int i = 0; i < 7; i++) {
            Thread t1 = new Thread(new Customer());
            Thread t2 = new Thread(new Customer());

            t1.start(); t2.start();

            try {
                t1.join();
                t2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}