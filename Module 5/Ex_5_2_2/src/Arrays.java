import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Random;

public class Arrays implements Runnable{
    private static ArrayList<Integer> list = new ArrayList<Integer>();

    synchronized public void add(int value) {
        list.add(value);
    }

    synchronized public void remove(int value) {
        list.remove(value);
    }

    synchronized public int get(int index) {
        return list.get(index);
    }

    synchronized public static ArrayList<Integer> getList() {
        return list;
    }

    @Override
    synchronized public String toString() {
        return list.toString();
    }

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            Random r = new Random();
            int c = r.nextInt(2);
            synchronized (this) {
                System.out.println(Thread.currentThread().getName() + " Adds: " + i);
                add(i);
            }

            switch (c){
                case 0:
                   break;
                case 1:
                    try {
                        synchronized (this) {
                            int remove = r.nextInt(list.size());
                            System.out.println(Thread.currentThread().getName() + " Removes: " + getList().get(remove));
                            remove(remove);
                        }
                        break;

                    }catch (IllegalArgumentException e){
                        break;
                    }


            }


            synchronized (this) {
                try {
                    System.out.println(toString());
                }catch (ConcurrentModificationException e){
                    System.out.println("ConcurrentModificationException");
                }

          }

        }



    }
}
